import java.util.Calendar;
import java.util.PriorityQueue;

//Класс для записи на прием
public class MakeAnAppointment {
    //создаем объект списка пациентов
    Patients patients = new Patients();
    //создаем очередь, основанную на списке пациентов
    PriorityQueue<Registration> queue= new PriorityQueue<>(patients.map.values());

    public void printQueue(){
        int count = 0;
        for(Registration p : queue){
            count++;
            System.out.println(count + ". " +p.toString());
        }
    }

    public void putQueue(Registration patient){
        queue.add(patient);
    }

}
