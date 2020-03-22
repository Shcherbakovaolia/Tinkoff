

public class Plus implements ICalculate {
    @Override
    public double calculate(double x, double y) {
        System.out.print(x + "+" + y + "=");
        return x + y;
    }
}

