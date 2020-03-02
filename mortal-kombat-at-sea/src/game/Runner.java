package game;

import ship.Caravel;
import ship.Frigate;
import ship.Galleon;
import ship.Helper;

/*
 * ??????????.
 */
public class Runner {

    public static void main(String[] args) {
        //  Menu menu = new Menu();
        // Logo.printLogo();
        //  menu.menuGame();

        //проверяем методы класса Galleon
        Galleon galleon = new Galleon("galleon", 3, "purple", false, 4, true, 3);
        System.out.println(galleon.animal());
        Helper.output(galleon.animal(4));
        galleon.moor();



        //проверяем методы класса Caravel
        Caravel caravel = new Caravel("caravel", 2, "blue", false, false, true);
        caravel.upLadder();
        if (caravel.upLadder) {
            Helper.output("Трап правда поднят");
        }
        caravel.upSails();
        if (caravel.upSails) {
            Helper.output("Паруса правда подняты");
        }

        //проверяем методы классов Frigate и Ship
        Frigate frigate = new Frigate("frigate", 1, "white", true, true, 2, 3);
        frigate.shoot();
        frigate.move();
        frigate.stop();
        frigate.moor();
    }
}

