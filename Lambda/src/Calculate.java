
import java.util.Scanner;

public class Calculate {
    Scanner scannerX = new Scanner(System.in);
    Scanner scannerY = new Scanner(System.in);

    public void calculate(ICalculate calculate) {
        System.out.println("Введите два числа");
        System.out.println(calculate.calculate(scannerX.nextDouble(), scannerY.nextDouble()));
    }


}
