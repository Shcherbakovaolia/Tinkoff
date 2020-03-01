package ship;

public class Ship {


    public String name; //���
    public int deck; //������
    public int board; //����
    public String color; //����
    public boolean downAnchor; //�����


    public Ship(String name, int deck, String color, boolean downAnchor) {
        this.name = name;
        this.deck = deck;
        this.board = 2;
        this.color = color;
        this.downAnchor = downAnchor;
    }

    //����� ��� ������� ������� ���������
    public void move() {
        if (!this.downAnchor) {
            System.out.println("������� " + name + " ������");
        } else
            System.out.println("������� �� ����� �����, � ���� ������ �����");
    }


    //����� ��� ������� ������� ���������������
    public void stop() {
        if (this.downAnchor) {
            System.out.println("������� " + name + " �����������");
        } else
            System.out.println("������� �� ����� ������������, ��� ��� � ���� ������ �����");
    }

    public void moor() {
        System.out.println("������� " + name + " ��������");
    }

}