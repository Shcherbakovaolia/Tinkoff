import java.text.DecimalFormat;

public class Runner {

    public static void main(String[] args) {

        Stream array = new Stream();
        DecimalFormat df = new DecimalFormat("#.##");

        array.add();

        int a = 0;
        //цикл, выводящий все элементы листа
        for (int i : array.list) {
            a++;
            if (a < 70) {
                System.out.print(i + ",");
            } else System.out.println(i);
        }
        for (int x = 0; x < 10; x++) {
            System.out.println("Кол-во " + x + ": " + array.streamList(x) + "; "
                    + df.format((array.streamList(x) * 100) / 70.0) + "%");
        }

    }

}


