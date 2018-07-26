package classwork_07_16;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testBuildQueryWithNull() {
        assertEquals("SELECT * FROM users", Main.buildQuery("users", null));
    }

    @Test
    public void testBuildQueryWithEmptyMap() {
        assertEquals("SELECT * FROM users", Main.buildQuery("users", new HashMap<>()));
    }

    @Test
    public void testBuildQueryWithCriteria() {
        Map<String, String> criteria = new TreeMap<>();
        criteria.put("col1", "val1");
        assertEquals("SELECT * FROM users WHERE col1='val1'", Main.buildQuery("users", criteria));

        criteria.put("col2", "val2");
        criteria.put("col3", "val3");
        assertEquals("SELECT * FROM users WHERE col1='val1' AND col2='val2' AND col3='val3'", Main.buildQuery("users", criteria));
    }

    @Test
    public void testAndToOr() {
        Map<String, String> criteria = new TreeMap<>();
        criteria.put("col1", "val1");
        criteria.put("col2", "val2");
        criteria.put("col3", "val3");
        criteria.put("col4", "val4");
        assertEquals("SELECT * FROM users WHERE col1='val1' OR col2='val2' OR col3='val3' OR col4='val4'", Main.andToOr(Main.buildQuery( "users", criteria )));
    }

    @Test
    public void testFirstCriteria() {
        Map<String, String> criteria3 = new HashMap<>();
        criteria3.put("name", "Jonas");
        criteria3.put("surname", "Jonaitis");
        criteria3.put("age", "28");
        criteria3.put("nationality", "Lithuanian");
        criteria3.put("income", "3000$");
        criteria3.put("status", "alive");
        assertEquals( "SELECT * FROM users WHERE name='Jonas'", Main.firstCriteria( Main.buildQuery( "users", criteria3 ) ) );
    }


}