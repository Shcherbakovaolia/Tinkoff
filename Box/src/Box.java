//класс с коробкой

import java.util.ArrayList;

public class Box<T> {
    private ArrayList<T> thing = new ArrayList<>();

    //метод, который кладет объект в коробку
    public void add(T object) {
        thing.add(object);
    }

    // метод, который
    // достает объект
    // из коробки
    public T getThing(int numer) { //numer - порядковый номер объекта в массиве
        try {
            return thing.get(numer);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Неправильный индекс объекта, в коробке "
                    + thing.size() + " элементов");
            return null;
        }
    }

    //метод, который удаляет объект из коробки
    public void removeThing(int numer) {
        try {
            thing.remove(numer);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Неправильный индекс объекта,"
                    + "в коробке " + thing.size()
                    + " элементов");
        }
    }

    //метод, возвращающий размер коробки
    public int sizeThings() {
        return thing.size();
    }
}
