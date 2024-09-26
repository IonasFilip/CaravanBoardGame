public class CaravanRow {

    private Caravan Player1Row;
    private Caravan Player2Row;

    public CaravanRow(){
        this.Player1Row = new Caravan();
        this.Player2Row = new Caravan();
    }

    public Caravan getCaravan(boolean player1){
        if(player1){
            return Player1Row;
        }else{
            return Player2Row;
        }
    }
}
