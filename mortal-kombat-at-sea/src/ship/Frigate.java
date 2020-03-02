package ship;

public class Frigate extends Ship {


    protected boolean upSails; //паруса
    protected int mast; // мачта
    protected int gun; //пушки


    public Frigate(String name, int deck, String color, boolean downAnchor, boolean upSails, int mast, int gun) {
        super(name, deck, color, downAnchor);
        this.upSails = upSails;
        this.mast = mast;
        this.gun = gun;

    }


    public void shoot() {
        Helper.output(name + " стреляет из " + this.gun + " пушек");
    }


    public void upSails() {
        Helper.output(name + " поднял паруса");
        upSails = true;
    }


}
