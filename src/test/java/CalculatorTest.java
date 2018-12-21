import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    Calculator testee;

    // Tests für addition
    @Test
    public void testSummeZweiIstOk1(){
        testee = new Calculator();
        assertTrue(testee.summe(10, 25) == 35) ;
    }
    @Test
    public void testSummeZweiIstOk2(){
        testee = new Calculator();
        assertTrue(testee.summe(25, 10) == 35) ;
    }
    @Test
    public void testSummeZweiIstOk3(){
        testee = new Calculator();
        assertTrue(testee.summe(-10, 25) == 15) ;
    }
    @Test
    public void testSummeZweiIstOk4(){
        testee = new Calculator();
        assertTrue(testee.summe(10, -25) == -15) ;
    }
    @Test
    public void testSummeZweiIstOk5(){
        testee = new Calculator();
        assertTrue(testee.summe(-10, -25) == -35) ;
    }
    @Test
    public void testSummeZweiIstOk6(){
        testee = new Calculator();
        assertTrue(testee.summe(2147483647, -25) == 2147483622) ;
    }
    @Test
    public void testSummeZweiIstOk7(){
        testee = new Calculator();
        assertTrue(testee.summe(-2147483647, 25) == -2147483622) ;
    }
    @Test
    public void testSummeZweiIstOk8(){
        testee = new Calculator();
        assertTrue(testee.summe(0, 0) == 0) ;
    }



    // Tests für Subtraktion
    @Test
    public void testSubtraktionZweiIstOk1(){
        testee = new Calculator();
        assertTrue(testee.subtraktion(25, 10) == 15);
    }
    @Test
    public void testSubtraktionZweiIstOk2(){
        testee = new Calculator();
        assertTrue(testee.subtraktion(10, 25) == -15);
    }
    @Test
    public void testSubtraktionZweiIstOk3(){
        testee = new Calculator();
        assertTrue(testee.subtraktion(-25, 10) == -35);
    }
    @Test
    public void testSubtraktionZweiIstOk4(){
        testee = new Calculator();
        assertTrue(testee.subtraktion(25, -10) == 35);
    }
    @Test
    public void testSubtraktionZweiIstOk5(){
        testee = new Calculator();
        assertTrue(testee.subtraktion(-25, -10) == -15);
    }
    @Test
    public void testSubtraktionZweiIstOk6(){
        testee = new Calculator();
        assertTrue(testee.subtraktion(2147483647, 10) == 2147483637);
    }
    @Test
    public void testSubtraktionZweiIstOk7(){
        testee = new Calculator();
        assertTrue(testee.subtraktion(10, 2147483647) == -2147483637);
    }
    @Test
    public void testSubtraktionZweiIstOk8(){
        testee = new Calculator();
        assertTrue(testee.subtraktion(0, -2147483647) == 2147483647);
    }



    // Tests für Multiplikation
    @Test
    public void testMultiplikationZweiIstOk1(){
        testee = new Calculator();
        assertTrue(testee.multiplikation(3, 4) == 12);
    }
    @Test
    public void testMultiplikationZweiIstOk2(){
        testee = new Calculator();
        assertTrue(testee.multiplikation(4, 3) == 12);
    }
    @Test
    public void testMultiplikationZweiIstOk3(){
        testee = new Calculator();
        assertTrue(testee.multiplikation(0, 4) == 0);
    }
    @Test
    public void testMultiplikationZweiIstOk4(){
        testee = new Calculator();
        assertTrue(testee.multiplikation(-3, 4) == -12);
    }
    @Test
    public void testMultiplikationZweiIstOk5(){
        testee = new Calculator();
        assertTrue(testee.multiplikation(3, -4) == -12);
    }
    @Test
    public void testMultiplikationZweiIstOk6(){
        testee = new Calculator();
        assertTrue(testee.multiplikation(-3, -4) == 12);
    }
    @Test
    public void testMultiplikationZweiIstOk7(){
        testee = new Calculator();
        assertTrue(testee.multiplikation(0, -2147483647) == 0);
    }
    @Test
    public void testMultiplikationZweiIstOk8(){
        testee = new Calculator();
        assertTrue(testee.multiplikation(2147483647, -1) == -2147483647);
    }



    //Tests für Division
    @Test
    public void testDivisionZweiIstOk1(){
        testee = new Calculator();
        assertTrue(testee.division(56, 7) == 8);
    }
    @Test
    public void testDivisionZweiIstOk2(){
        testee = new Calculator();
        assertTrue(testee.division(56, 10) == 5);
    }
    @Test
    public void testDivisionZweiIstOk3(){
        testee = new Calculator();
        assertTrue(testee.division(3, 6) == 0);
    }
    @Test
    public void testDivisionZweiIstOk4(){
        testee = new Calculator();
        assertTrue(testee.division(-12, 3) == -4);
    }
    @Test
    public void testDivisionZweiIstOk5(){
        testee = new Calculator();
        assertTrue(testee.division(-12, -4) == 3);
    }
    @Test
    public void testDivisionZweiIstOk6(){
        testee = new Calculator();
        assertTrue(testee.division(12, -3) == -4);
    }
    @Test
    public void testDivisionZweiIstOk7(){
        testee = new Calculator();
        assertTrue(testee.division(2147483647, 1) == 2147483647);
    }
    @Test
    public void testDivisionZweiIstOk8(){
        testee = new Calculator();
        assertTrue(testee.division(1, 4) == 0);
    }
}


