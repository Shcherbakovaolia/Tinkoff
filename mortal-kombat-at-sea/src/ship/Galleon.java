package ship;

public class Galleon extends Ship {


    protected int cabin; //каюта
    protected boolean hasHold; //трюм
    public int cat; //котик


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


    public String animal(int сarrots) {
        return ("На палубе находится " + cat + " котиков и " + сarrots + " попугаев ");
    }


    @Override
    public void moor() {
        Helper.output("Корабль " + name + " высадил котика на берег");
        Helper.output("Котиков на палубе теперь " + (this.cat - 1));
    }


}
