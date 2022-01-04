import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer myPrinter;


    @Before
    public void before(){
        myPrinter = new Printer(100,80);
    }

    @Test
    public void CheckNumberOfSheets(){
        assertEquals(100,myPrinter.NumberOfSheets());
    }

    @Test
    public void Print(){
        assertEquals(50,myPrinter.Print(10,5));
    }

    @Test
    public void checkIfCanPrintTrue() {
        assertEquals(true, myPrinter.CanPrint(10, 5));
    }

    @Test
    public void checkIfCanPrintFalse() {
        assertEquals(false, myPrinter.CanPrint(50, 20));
    }

    @Test
    public void CheckTonerReduces(){
        assertEquals(30, myPrinter.this.toner);
    }
}
