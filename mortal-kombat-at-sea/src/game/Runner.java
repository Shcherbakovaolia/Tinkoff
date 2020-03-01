package game;

import ship.Caravel;
import ship.Frigate;
import ship.Galleon;

/*
 * ??????????.
 */
public class Runner {

    public static void main(String[] args) {
        //  Menu menu = new Menu();
        // Logo.printLogo();
        //  menu.menuGame();

        //��������� ������ ������ Galleon
        Galleon galleon = new Galleon("galleon", 3, "purple", false, 4, true, 3);
        System.out.println(galleon.animal());
        System.out.println(galleon.animal(4));
        galleon.moor();


        //��������� ������ ������ Caravel
        Caravel caravel = new Caravel("caravel", 2, "blue", false, false, true);
        caravel.upLadder();
        if (caravel.upLadder) {
            System.out.println("���� ������ ������");
        }
        caravel.upSails();
        if (caravel.upSails) {
            System.out.println("������ ������ �������");
        }

        //��������� ������ ������� Frigate � Ship
        Frigate frigate = new Frigate("frigate", 1, "white", true, true, 2, 3);
        frigate.shoot();
        frigate.move();
        frigate.stop();
        frigate.moor();
    }
}

