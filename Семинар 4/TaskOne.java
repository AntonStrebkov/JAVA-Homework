import java.util.LinkedList;
import java.util.Scanner;

public class TaskOne {
    public void reverseLinkedList(){
        LinkedList<Integer> list = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Длина списка: ");
        int num = in.nextInt();
        System.out.println("Введите " + num + " элементов: ");
        for(int i = 0; i < num; i++){
            list.add(in.nextInt());
        }
        in.close();
        System.out.println(list);
        int temp = 0;
        while (temp != list.size() - 1) {
            list.add(list.size()-temp, list.getFirst());
            list.removeFirst();
            temp++;
        }
        System.out.println(list);

        }
    }


/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
