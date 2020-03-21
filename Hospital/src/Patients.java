import java.util.LinkedHashMap;
import java.util.Map;

//Класс со списком пациентов
public class Patients {
    
    public Patients() {
        map.put(6114.892334, new Registration("Иванов Иван Иванович", true, 12, 3, 2000));
        map.put(6045.339456, new Registration("Петров Петр Петрович", true, 27, 1, 1943));
        map.put(6101.233065, new Registration("Сидорова Марина Васильевна", false, 6, 10, 1955));
        map.put(6092.112408, new Registration("Сидоров Антон Викторович", true, 20, 7, 1930));
        map.put(6115.608075, new Registration("Иванова Наталья Олеговна", false, 4, 2, 2003));
        map.put(6119.230456, new Registration("Петрова Екатерина Михайловна", false, 19, 11, 1977));
        map.put(6000.128939, new Registration("Иванов Илья Андреевич", true, 30, 12, 1970));
        map.put(6110.625895, new Registration("Сидорова Валерия Максимовна", false, 21, 8, 1929));
        map.put(6148.935567, new Registration("Петров Артем Николаевич", true, 17, 5, 2003));
    }

    
    public LinkedHashMap <Double, Registration> map = new LinkedHashMap<>();
    //метод который кладет паспорт и пациента в список
    public void putPatient(Double passport, String fullName, boolean gender, int day, int month, int year) {
        map.put(passport,new Registration(fullName, gender, day, month, year));
        System.out.println(map.get(passport));
    }

}
