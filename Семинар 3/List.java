import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List {
    public void addList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Average: " + average(list));
    }

    public double average(ArrayList<Integer> list){
        double sum = 0;
        for (Integer item: list) {
            sum += item;
        }
        return sum / list.size();
    }
}

  /*
    Задан целочисленный список ArrayList.
    Найти минимальное, максимальное и среднее из этого списка.
     */