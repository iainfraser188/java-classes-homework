public class WaterBottle {
    private int volume = 100;
    public WaterBottle(){


    }

    public int getVolume(){
        return volume;
    }


    public int TakeDrink(){
        return volume - 10;
    }

    public int Empty(){
        return volume = 0;
    }

    public int Fill(){
        return volume = 100;
    }


}
