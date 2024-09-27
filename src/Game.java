public class Game {

    private Hand p1Hand;
    private Hand p2Hand;
    private Board board;
    private int handSize = 5;
    private Deck p1Deck;
    private Deck p2Deck;

    public Game(Deck p1, Deck p2){
        this.p1Deck = new Deck(p1.getDeck());
        this.p2Deck = new Deck(p2.getDeck());
        this.p1Hand = new Hand(p1Deck.drawCards(handSize));
        this.p2Hand = new Hand(p2Deck.drawCards(handSize));
        this.board = new Board();
    }

}
