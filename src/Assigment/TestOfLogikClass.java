package Assigment;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOfLogikClass {

    @Test
    public void testantalord() {
        // TextInfo textInfo = new TextInfo();
        TextInfotLogik textInfo = new TextInfotLogik();
        textInfo.calculation("Hej hur mår du");
        assertEquals(4, textInfo.getword());
    }

    @Test
    public void testantaltecken() {
        TextInfotLogik textInfo = new TextInfotLogik();
        //TextInfo textInfo = new TextInfo();
        textInfo.calculation("Hejsan");
        assertEquals(6, textInfo.getNumOfChar());
    }

    @Test
    public void testantalrader() {
        TextInfotLogik textInfo = new TextInfotLogik();
        textInfo.calculation("Rad ett");
        textInfo.calculation("Rad två");
        assertEquals(2, textInfo.getNumOfLine());


    }

    @Test
    public void testalängstaordet() {
        TextInfotLogik textInfo = new TextInfotLogik();
        textInfo.calculation("Fitore");
        textInfo.calculation("FitoreFitore");
        assertEquals("FitoreFitore", textInfo.getLongestWord());


    }
}
