package ship;

public final class Galleon extends Ship {


    private int cabin; //каюта
    private boolean hasHold; //трюм
    private int cat; //котик


    public Galleon(String name, int deck, String color, boolean downAnchor, int cabin, boolean hasHold, int cat) {
        super(name, deck, color, downAnchor);
        this.cabin = cabin;
        this.hasHold = hasHold;
        this.cat = cat;
    }
    
    

    public int animal() {
        Helper.output("Котиков на палубе находится: ");
        return (this.cat);
    }


    public String animal(final int carrots) {
        return ("На палубе находится " + cat + " котиков и " + carrots + " попугаев ");
    }


    @Override
    public void moor() {
        Helper.output("Корабль " + name + " высадил котика на берег");
        Helper.output("Котиков на палубе теперь " + (this.cat - 1));
        this.cat--;
    }


}
