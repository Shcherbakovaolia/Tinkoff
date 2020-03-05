package game;

import ship.*;

import java.util.Scanner;

/*
 * ??????????.
 */
public class Runner {

    public static void main(String[] args) {
        //  Menu menu = new Menu();
        // Logo.printLogo();
        //  menu.menuGame();

        //работа с вводом данных с клавиатуры
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Helper.output("Введите число котиков");

        //проверяем методы класса Galleon
        try {
            Galleon galleon = new Galleon("galleon", 4,
                    "purple", false, scanner1.nextInt());
            System.out.println(galleon.animal());
            Helper.output("Введите число попугаев");
            try {
                Helper.output(galleon.animal(scanner.nextInt()));
            } catch (MyException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                System.err.println("Некоректное значение, "
                        + "введите цифру");
            }
            galleon.moor();
        } catch (MyException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Некоректное значение, "
                    + "введите цифру");
        }


        //проверяем методы класса Caravel


        Caravel caravel = new Caravel("caravel", 2, "blue",
                false, false, true);
        caravel.upLadder();
        if (caravel.isUpLadder()) {
            Helper.output("Трап правда поднят");
        }
        caravel.upSails();
        if (caravel.isUpSails()) {
            Helper.output("Паруса правда подняты");
        }


        //проверяем методы классов Frigate и Ship

        Helper.output("Введите число пушек на Galleon");
        Scanner scanner2 = new Scanner(System.in);
        try {
            Frigate frigate = new Frigate("frigate", 2, "white",
                    true, true, scanner2.nextInt());
            frigate.shoot();
            frigate.move();
            frigate.stop();
            frigate.moor();
        } catch (MyException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Некоректное значение, "
                    + "введите цифру");
        }
    }
}

