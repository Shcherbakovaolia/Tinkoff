package ship;

public class Galleon extends Ship {


    public int cabin; //�����
    public boolean hasHold; //����
    public int cat; //�����


    public Galleon(String name, int deck, String color, boolean downAnchor, int cabin, boolean hasHold, int cat) {
        super(name, deck, color, downAnchor);
        this.cabin = cabin;
        this.hasHold = hasHold;
        this.cat = cat;
    }


    public int animal() {
        System.out.print("������� �� ������ ���������: ");
        return (this.cat);
    }


    public String animal(int �arrot) {
        int carrots = �arrot;
        return ("�� ������ ��������� " + cat + " ������� � " + carrots + " �������� ");
    }


    @Override
    public void moor() {
        System.out.println("������� " + name + " ������� ������ �� �����");
        System.out.println("������� �� ������ ������ " + (this.cat - 1));
    }


}
