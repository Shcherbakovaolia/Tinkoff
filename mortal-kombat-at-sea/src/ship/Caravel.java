package ship;

public class Caravel extends Ship {


    public boolean upSails; //������
    public boolean upLadder; //����


    public Caravel(String name, int deck, String color, boolean downAnchor, boolean upSails, boolean upLadder) {
        super(name, deck, color, downAnchor);
        this.upSails = upSails;
        this.upLadder = upLadder;
    }


    public void upSails() {
        System.out.println(name + " ������ ������");
        this.upSails = true;
    }


    public void upLadder() {
        System.out.println(name + " ������ ����");
        this.upLadder = true;
    }
}

