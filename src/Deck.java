import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> Deck;

    public Deck(){
        this.Deck = new ArrayList<>();
    }

    public Deck(List<Card> Deck){
        this.Deck = Deck;
    }

    public List<Card> getDeck() {
        return Deck;
    }

    public void setDeck(List<Card> deck) {
        Deck = deck;
    }
}
