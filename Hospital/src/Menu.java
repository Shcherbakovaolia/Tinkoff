import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//Класс, в котором находится Меню
public class Menu {

    private int numer;
    private Scanner scannerNumer = new Scanner(System.in);
    MakeAnAppointment queue = new MakeAnAppointment();
    Patients patients = new Patients();

    public void setNumer() {
        this.numer = scannerNumer.nextInt();
    }

    public void menu() {
        while (this.numer <= 2) {
            System.out.println("Добро пожаловать в поликлиннику!");
            System.out.println("");
            System.out.println("Выберите нужное вам поле:");
            System.out.println("1.Регистрация");
            System.out.println("2.Запись на прием");
            System.out.println("3.Выход из программы");
            setNumer();

            if (this.numer == 1) {
                Passport passport = new Passport();
                Scanner scannerName = new Scanner(System.in);
                Scanner scannerGender = new Scanner(System.in);
                Scanner scannerDay = new Scanner(System.in);
                Scanner scannerMonth = new Scanner(System.in);
                Scanner scannerYear = new Scanner(System.in);
                Scanner scannerPassport = new Scanner(System.in);
                double pass;
                boolean gender;
                int day;
                int month;
                int year;

                System.out.println("Введите паспорт");
                try {
                    pass = scannerPassport.nextDouble();
                    passport.setPassport(pass);
                } catch (Exception e) {
                    throwError(e.getMessage());
                    continue;
                }

                System.out.println("Введите ваше ФИО");
                String name = scannerName.next();
                System.out.println("Введите ваш пол: мужской - true, женский - false");

                try {
                     gender = scannerGender.nextBoolean();
                } catch (Exception e) {
                    throwError(e.getMessage());
                    continue;
                }

                System.out.println("Введите день вашего рождения");
                try {
                     day = scannerDay.nextInt();
                } catch (Exception e) {
                    throwError(e.getMessage());
                    continue;
                }

                System.out.println("Введите месяц вашего рождения");
                try {
                     month = scannerMonth.nextInt();
                } catch (Exception e) {
                    throwError(e.getMessage());
                    continue;
                }

                System.out.println("Введите год вашего рождения");
                try {
                    year = scannerYear.nextInt();
                } catch (Exception e) {
                    throwError(e.getMessage());
                    continue;
                }
                //добавляем пациента в список
                patients.putPatient(passport.getPassport(), name, gender, day, month, year);
                //добавляем пациента в очередь
                queue.putQueue(new Registration(name, gender, day, month, year));
                int count = 0;
                for (Map.Entry<Double, Registration> patient : patients.map.entrySet()) {
                    count++;
                    System.out.println(count + ". " + patient.toString());
                }
            }

            if (this.numer == 2) {
                queue.printQueue();
            }

            if (this.numer < 1 || this.numer > 3) {
                throwError();
            }

        }
    }

    //выводит ошибку если команда не верна
    //и позволяет продолжить работу программы
    public void throwError() {
        System.out.println("Неверная команда, выберете другое");
        this.numer = 1;
    }
    //выводит сообщение при исключении
    public void throwError(String message) {
        System.err.println(message);
        this.numer = 1;
    }
}




