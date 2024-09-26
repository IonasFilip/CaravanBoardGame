import java.util.ArrayList;
import java.util.List;

public class Caravan {

    private int total;
    private List<Card> Row;

    public Caravan(){
        Row = new ArrayList<>();
    }

    public void addCard(Card card){
        Row.add(card);
        total += card.getValue();
    }

    public int getTotal() {
        return total;
    }

    public boolean removeCard(Card card){
        if (Row.contains(card)){
            Row.remove(card);
            return true;
        }else{
            System.out.println("Row doesn't contain card");
            return false;
        }
    }
}
