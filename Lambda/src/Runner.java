public class Runner {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        //сложение двух чисел
        calculate.calculate(new Plus());

        //умножение двух чисел
        calculate.calculate(new ICalculate() {

            @Override
            public double calculate(double x, double y) {
                System.out.print(x + "*" + y + "=");
                return x * y;
            }
        });

        //деление двух чисел
        calculate.calculate((double x, double y) -> {
            System.out.print(x + "/" + y + "=");
            return x / y;
        });

        //вычитание двух чисел
        calculate.calculate((double x, double y) -> {
            System.out.print(x + "-" + y + "=");
            return x - y;
        });

        //вывод максимального числа
        calculate.calculate((double x, double y) -> {
            System.out.print("Максимальное число = ");
            return Math.max(x, y);
        });

        // возведение меньшего числа в степень разницы между большим и меньшим числом,
        // умножение результата на 10 и деление на большее число
        calculate.calculate((double x, double y) -> {
            System.out.print("Возведение меньшего числа в степень разницы между большим и меньшим числом, "
                    + "умножение результата на 10 и деление на большее число = ");
            double zMin = Math.min(x, y);
            double zMax = Math.max(x, y);
            double zMinus = zMax - zMin;
            return (Math.pow(zMin, zMinus) * 10) / zMax;
        });

        //нахождение того, сколько меньшее число составляет процентов от большего
        calculate.calculate((double x, double y) -> {
            double zMin = Math.min(x, y);
            double zMax = Math.max(x, y);
            System.out.print(zMin + " составляет от " + zMax + " % =");
            return (zMin * 100) / zMax;

        });

    //остаток от деления большего числа на меньшее
        calculate.calculate((double x, double y) -> {
            double zMin = Math.min(x, y);
            double zMax = Math.max(x, y);
            System.out.print("Остаток от деления "+ zMax + " на " + zMin + " = ");
            return zMax%zMin;

        });
    }
}


