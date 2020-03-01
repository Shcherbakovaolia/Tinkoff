package ship;

public class Ship {


    public String name; //им€
    public int deck; //палуба
    public int board; //борт
    public String color; //цвет
    public boolean downAnchor; //€корь


    public Ship(String name, int deck, String color, boolean downAnchor) {
        this.name = name;
        this.deck = deck;
        this.board = 2;
        this.color = color;
        this.downAnchor = downAnchor;
    }

    //метод при котором корабль отплывает
    public void move() {
        if (!this.downAnchor) {
            System.out.println(" орабль " + name + " плывет");
        } else
            System.out.println(" орабль не может плыть, у него опущен €корь");
    }


    //метод при котором корабль останавливаетс€
    public void stop() {
        if (this.downAnchor) {
            System.out.println(" орабль " + name + " остановилс€");
        } else
            System.out.println(" орабль не может остановитьс€, так как у него подн€т €корь");
    }

    public void moor() {
        System.out.println(" орабль " + name + " причалил");
    }

}