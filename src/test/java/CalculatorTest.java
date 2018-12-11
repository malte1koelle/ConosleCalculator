import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    Calculator testee;

    @Test
    public void testSummeZweiIstOk(){
        testee = new Calculator();
        System.out.println("First test");
        assertTrue(testee.summe(10, 25) == 35) ;
    }

    @Test
    public void testSubtraktionZweiIstOk(){
        testee = new Calculator();
        System.out.println("Second test");
        assertTrue(testee.subtraktion(25, 10) == 15);
    }
}
