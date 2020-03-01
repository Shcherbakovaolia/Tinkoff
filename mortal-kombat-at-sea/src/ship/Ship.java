package ship;

public class Ship {


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

    //метод при котором корабль отплывает
    public void move() {
        if (!this.downAnchor) {
            System.out.println("Корабль " + name + " плывет");
        } else
            System.out.println("Корабль не может плыть, у него опущен якорь");
    }


    //метод при котором корабль останавливается
    public void stop() {
        if (this.downAnchor) {
            System.out.println("Корабль " + name + " остановился");
        } else
            System.out.println("Корабль не может остановиться, у него поднят якорь");
    }

    public void moor() {
        System.out.println("Корабль " + name + " причалил");
    }

}