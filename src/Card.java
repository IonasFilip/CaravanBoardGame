public class Card {

    private String name;
    private int value;

    private boolean special;

    public Card(int value, boolean special, String name){
        this.value = value;
        this.special = special;
        this.name = name;
    }

    public Card(){
        value = 1;
        special = false;
        name = "Null";
    }

    public int getValue() {
        return value;
    }

    public boolean isSpecial() {
        return special;
    }

    public String getName() {
        return name;
    }
}
