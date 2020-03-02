package ship;

public abstract class Ship implements ISwimmer {


    public String name; //имя
    public int deck; //палуба
    public int board; //борт
    public String color; //цвет
    public boolean downAnchor; //якорь


    public Ship(String name, int deck, String color, boolean downAnchor) {
        this.name = name;
        this.deck = deck;
        this.board = 2;
        this.color = color;
        this.downAnchor = downAnchor;
    }

    @Override
    public void move() {
        if (!this.downAnchor) {
            Helper.output("Корабль " + name + " плывет");
        } else
            Helper.output("Корабль не может плыть, у него опущен якорь");
    }


    @Override
    public void stop() {
        if (this.downAnchor) {
            Helper.output("Корабль " + name + " остановился");
        } else
            Helper.output("Корабль не может остановиться, так как у него поднят якорь");
    }

    @Override
    public void moor() {
        Helper.output("Корабль " + name + " причалил");
    }

}