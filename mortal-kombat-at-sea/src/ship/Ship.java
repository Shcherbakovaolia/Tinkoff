package ship;

public abstract class Ship implements ISwimmer {

    public final String name; //имя
    private final int  deck; //палуба
    private int board; //борт
    private final String color; //цвет
    public boolean downAnchor; //якорь


    public Ship(String name, int deck, String color, boolean downAnchor) {
        this.name = name;
        this.board = 2;
        this.color = color;
        this.downAnchor = downAnchor;
        this.deck = deck;

    }

    public int getDeck() {
        return deck;
    }

    public int getBoard() {
        return board;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void move() {
        if (!this.downAnchor) {
            Helper.output("Корабль " + name + " плывет");
        } else {
            Helper.output("Корабль не может плыть,"
                    + " у него опущен якорь");
        }

    }


    @Override
    public void stop() {
        if (this.downAnchor) {
            Helper.output("Корабль " + name + " остановился");
        } else {
            Helper.output("Корабль не может "
                   + "остановиться, так как у "
                   + "него поднят якорь");
        }
    }

    @Override
    public void moor() {
        Helper.output("Корабль " + name + " причалил");
    }

}