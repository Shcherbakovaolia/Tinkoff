package ship;

public class Galleon extends Ship {


    public int cabin; //каюта
    public boolean hasHold; //трюм
    public int cat; //котик


    public Galleon(String name, int deck, String color, boolean downAnchor, int cabin, boolean hasHold, int cat) {
        super(name, deck, color, downAnchor);
        this.cabin = cabin;
        this.hasHold = hasHold;
        this.cat = cat;
    }


    public int animal() {
        System.out.print("Котиков на палубе находится: ");
        return (this.cat);
    }


    public String animal(int сarrot) {
        int carrots = сarrot;
        return ("На палубе находится " + cat + " котиков и " + carrots + " попугаев ");
    }


    @Override
    public void moor() {
        System.out.println("Корабль " + name + " высадил котика на берег");
        System.out.println("Котиков на палубе теперь " + (this.cat - 1));
    }


}
