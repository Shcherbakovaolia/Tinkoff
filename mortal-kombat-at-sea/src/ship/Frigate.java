package ship;

public final class Frigate extends Ship {
    private boolean upSails; //паруса
    private int gun; //пушки

    public Frigate(String name, int deck, String color, boolean downAnchor,
                   boolean upSails, int gun) throws MyException {
        super(name, deck, color, downAnchor);
        this.upSails = upSails;
        if (gun < 0) {
            throw new MyException ("Пушек не может"
                   + " быть меньше нуля");
        } else {
            this.gun = gun;
        }
    }

    public boolean isUpSails() {
        return upSails;
    }

    public void shoot() {
        Helper.output(name + " стреляет из "
                + this.gun + " пушек");
    }

    public void upSails() {
        Helper.output(name + " поднял паруса");
        this.upSails = true;
    }
}
