package homework_07_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testFilesCreator() {
        assertEquals("Margarita\nSalami\nSočioji\nHavajų\nKebabas\nHamburgeris\n======\nVanduo\nKava\n" +
                "Coca-Cola\nMineralinis\nArbata\nSultys\nAlus\nSprite", Main.filesCreator());
    }


}