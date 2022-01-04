import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator myCalculator;

    @Test
    public void addNumbers(){
        myCalculator = new Calculator(2,2);
        assertEquals(4,myCalculator.add());
    }
}
