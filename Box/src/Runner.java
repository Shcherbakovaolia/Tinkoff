//класс запускающий программу

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Box<String> object = new Box<>();

        object.add("3");
        object.add("1");
        object.add("2");
        object.add("4");

        System.out.println(object.getThing(2));
        object.removeThing(2);
        System.out.println(object.getThing(2));

        //вывод всех объектов из коробки
       /* for (int x=0; x<object.sizeThings(); x++){
            System.out.println(object.getThing(x));
        }*/

    }
}
