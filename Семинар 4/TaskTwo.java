import java.util.LinkedList;
import java.util.Scanner;

public class TaskTwo {
    Scanner in = new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<>();
    public LinkedList<Integer> createLinkedList(){
        System.out.println("Длина списка: ");
        int num = in.nextInt();
        System.out.println("Введите " + num + " элементов: ");
        for(int i = 0; i < num; i++){
            list.add(in.nextInt());
        }
        in.close();
        return list;
    }

    public void enqueue(LinkedList<Integer> list, int num){
        list.addLast(num);
    }
    public int dequeue(LinkedList<Integer> list){
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }
    public int first(LinkedList<Integer> list){
        int num = 0;
        num = list.getFirst();
        return num;
    }
}

/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
