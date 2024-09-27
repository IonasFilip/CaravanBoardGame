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

    public List<Card> drawCards(int amount){
        List<Card> cards = new ArrayList<>();
        for(int i=0; i<amount; i++){
            int cardIndex = (int) (Math.random() * 49);
            cards.add(Deck.get(cardIndex));
            Deck.remove(cardIndex);
        }
        return cards;
    }

    public Card drawCard(){
        int cardIndex = (int) (Math.random() * 49);
        Deck.remove(cardIndex);
        return (Deck.get(cardIndex));
    }
}
