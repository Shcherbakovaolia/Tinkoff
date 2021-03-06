package ship;

public final class Caravel extends Ship {


    private boolean upSails; //паруса
    private boolean upLadder; //трап


    public Caravel(String name, int deck, String color, boolean downAnchor, boolean upSails, boolean upLadder) {
        super(name, deck, color, downAnchor);
        this.upSails = upSails;
        this.upLadder = upLadder;
    }

    public boolean isUpLadder() {
        return upLadder;
    }

    public boolean isUpSails() {
        return upSails;
    }

    public void upSails() {
        Helper.output(name + " поднял паруса");
        this.upSails = true;
    }


    public void upLadder() {
        Helper.output(name + " поднял трап");
        this.upLadder = true;
    }
}

