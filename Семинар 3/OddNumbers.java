import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class OddNumbers {

    public void getOdd() {
        ArrayList<Integer> listOdd = new ArrayList<>();
        listOdd.add(1);
        listOdd.add(2);
        listOdd.add(3);
        listOdd.add(4);
        listOdd.add(22);
        listOdd.add(13);
        System.out.println("Изначальный лист: " +  listOdd);

        Iterator<Integer> iterator = listOdd.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Без четных чисел: " + listOdd);
    }
}
/*
Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
