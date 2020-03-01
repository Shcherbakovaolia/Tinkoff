package ship;

public class Frigate extends Ship {


    public boolean upSails; //паруса
    public int mast; // мачта
    public int gun; //пушки


    public Frigate(String name, int deck, String color, boolean downAnchor, boolean upSails, int mast, int gun) {
        super(name, deck, color, downAnchor);
        this.upSails = upSails;
        this.mast = mast;
        this.gun = gun;

    }


    public void shoot() {
        System.out.println(name + " стреляет из " + this.gun + " пушек");
    }


    public void upSails() {
        System.out.println(name + " поднял паруса");
        upSails = true;
    }


}
