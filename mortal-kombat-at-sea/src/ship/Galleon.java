package ship;

public final class Galleon extends Ship {


    private int cat; //котик


    public Galleon(String name, int deck, String color,
                   boolean downAnchor, int cat) throws MyException {
        super(name, deck, color, downAnchor);
        if (cat < 0) {
            throw new MyException("Котов не может "
                    + "быть меньше нуля");
        } else {
            this.cat = cat;
        }
    }


    public int animal() {
        Helper.output("Котиков на палубе находится: ");
        return (this.cat);
    }


    public String animal(final int carrots) throws MyException {
        if (carrots < 0) {
            throw new MyException("Значение попугаев"
                   + " не может быть меньше 0");
        }
        return ("На палубе находится " + cat
                + " котиков и " + carrots + " попугаев ");
    }


    @Override
    public void moor() {
        Helper.output("Корабль " + name + " высадил"
                + " котика на берег");
        Helper.output("Котиков на палубе теперь "
                + (this.cat - 1));
        this.cat--;
    }


}
