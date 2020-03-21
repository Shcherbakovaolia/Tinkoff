//класс для регистрации пациента
import java.util.*;

//Класс, в котором находится регистрация
public class Registration implements Comparable<Registration> {
    public String fullName;
    public boolean gender;
    public int isOld;//переменная для того чтобы указать, что пациент пенсионер или нет
    Calendar dateOfBirth;

    public Registration(String fullName, boolean gender, int day, int month, int year) {
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = new GregorianCalendar(year, month, day);
        this.isOld = isOldMan();//устанавливаем статус пенсионера, для сортировки в очереди
    }

    //переопределяем метод .toString() для вывода информации о пациенте
    @Override
    public String toString() {
        String gender1 = (this.gender) ? "мужской" : "женский";
        return ("ФИО: " + this.fullName + ", пол: " + gender1 + ", дата рождения: "
                + this.dateOfBirth.get(Calendar.DAY_OF_MONTH) + "." + this.dateOfBirth.get(Calendar.MONTH)
                + "." + this.dateOfBirth.get(Calendar.YEAR));
    }

    // переопределяем компаратор для определения приоритета очереди
   @Override
    public int compareTo(Registration r1) {
       return Integer.compare(r1.isOld,this.isOld);
    }
    //проверка, является ли пациент пенсионером
    private int isOldMan() {
        int year = (this.gender)? 1955 : 1960;
        boolean check = (year-this.dateOfBirth.get(Calendar.YEAR)>=0);
        return (check)? 1:0;
    }
}

















/*    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    Registration patient1 = new Registration("Иванов Иван Иванович", "Мужчина", "12.03.2000");
    Registration patient2 = new Registration("Петров Петр Петрович", "Мужчина", "27.01.1943");
    Registration patient3 = new Registration("Сидорова Марина Васильевна", "Женщина", "06.10.1955");
    Registration patient4 = new Registration("Сидоров Антон Викторович", "Мужчина", "20.07.1930");
    Registration patient5 = new Registration("Иванова Наталья Олеговна", "Женщина", "04.02.2003");
    Registration patient6 = new Registration("Петрова Екатерина Михайловна", "Женщина", "19.11.1998");
    Registration patient7 = new Registration("Иванов Илья Андреевич", "Мужчина", "30.12.1994");
    Registration patient8 = new Registration("Сидорова Валерия Максимовна", "Женщина", "21.08.1976");
    Registration patient9 = new Registration("Петров Артем Николаевич", "Мужчина", "17.05.2003");
    Registration patient10 = new Registration(scanner.next(), scanner1.next(), scanner2.next());


    }*/


