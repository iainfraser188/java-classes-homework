import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator myCalculator;

    @Test
    public void addNumbers(){
        myCalculator = new Calculator();
        assertEquals(4,myCalculator.add(2,2));
    }

    @Test
    public void subtractNumbers(){
        myCalculator = new Calculator();
        assertEquals(2,myCalculator.subtract(5,3));
    }

    @Test
    public void multiplyNumbers(){
        myCalculator = new Calculator();
        assertEquals(4,myCalculator.multiply(2,2));
    }

    @Test
    public void divideNumbers(){
        myCalculator = new Calculator();
        assertEquals(1.8,myCalculator.divide(9, 5),0.0);
    }
}
