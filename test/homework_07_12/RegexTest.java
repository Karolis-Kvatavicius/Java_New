package homework_07_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegexTest {

    @Test
    public void testCutUrlFirst() {
        assertEquals("/demo/19/automobilis", Regex.cutUrl( Regex.getFIRST() )  );
    }

    @Test
    public void testCutUrlSecond() {
        assertEquals("id=140", Regex.cutUrl( Regex.getSECOND() )  );
    }

    @Test
    public void testCutUrlThird() {
        assertEquals("/demo", Regex.cutUrl( Regex.getTHIRD() )  );
    }

    @Test
    public void testCutUrlFourth() {
        assertEquals("automobilis", Regex.cutUrl( Regex.getFOURTH() )  );
    }
}