import java.util.ArrayList;
import java.util.Random;

public class Stream {

    final Random random = new Random();
    public ArrayList<Integer> list = new ArrayList<>();

    //метод, добавляющий 70 рандомных элементов в лист
    public void add() {
        for (int x = 0; x < 70; x++) {
            list.add(random.nextInt(10));
        }
    }
    public int streamList(int x) {
        return (int) list.stream().filter(a -> a.equals(x)).count();
    }


}
