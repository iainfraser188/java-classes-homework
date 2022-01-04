import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle myWaterBottle;

    @Test
    public void checkVolume(){
        myWaterBottle = new WaterBottle();
        assertEquals(100,myWaterBottle.getVolume());
    }

    @Test
    public void TakeDrink(){
        myWaterBottle = new WaterBottle();
        assertEquals(90,myWaterBottle.TakeDrink(),myWaterBottle.getVolume());
    }

    @Test
    public void Empty(){
        myWaterBottle = new WaterBottle();
        assertEquals(0,myWaterBottle.Empty(),myWaterBottle.getVolume());
    }

    @Test
    public void Fill(){
        myWaterBottle = new WaterBottle();
        assertEquals(0,myWaterBottle.Fill(),myWaterBottle.getVolume());
    }


}
