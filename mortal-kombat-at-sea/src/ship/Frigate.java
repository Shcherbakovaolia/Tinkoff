package ship;

public class Frigate extends Ship {


    public boolean upSails; //������
    public int mast; // �����
    public int gun; //�����


    public Frigate(String name, int deck, String color, boolean downAnchor, boolean upSails, int mast, int gun) {
        super(name, deck, color, downAnchor);
        this.upSails = upSails;
        this.mast = mast;
        this.gun = gun;

    }


    public void shoot() {
        System.out.println(name + " �������� �� " + this.gun + " �����");
    }


    public void upSails() {
        System.out.println(name + " ������ ������");
        upSails = true;
    }


}
