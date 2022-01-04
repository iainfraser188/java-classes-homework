public class Printer {
    private  int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets=sheets;
        this.toner=toner;


    }
    public int NumberOfSheets(){
        return this.sheets;
    }

    public int Print(int pages,int copies){
        if (this.sheets > (pages * copies)) {
            return this.sheets -= (pages * copies);
        }
        if (this.sheets > (pages * copies)){
            return this.toner -= (pages * copies);
        }
        return this.sheets;
    }

    public boolean CanPrint(int pages, int copies) {
        if (sheets > (pages * copies)) {
            return true;
        } else {
            return false;
        }

    }




}
