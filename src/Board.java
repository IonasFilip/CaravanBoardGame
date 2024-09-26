public class Board {
     private CaravanRow row1;
     private CaravanRow row2;
     private CaravanRow row3;

     public Board(){
         this.row1 = new CaravanRow();
         this.row2 = new CaravanRow();
         this.row3 = new CaravanRow();
     }

    public CaravanRow getRow1() {
        return row1;
    }

    public CaravanRow getRow2() {
        return row2;
    }

    public CaravanRow getRow3() {
        return row3;
    }
}
