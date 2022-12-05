import java.util.LinkedList;

public class MainOne {
    public static void main(String[] args) {

//        TaskOne taskOne = new TaskOne();
//        taskOne.reverseLinkedList();

        TaskTwo taskTwo = new TaskTwo();
        LinkedList<Integer> list = taskTwo.createLinkedList();
        taskTwo.enqueue(list, 3);
        System.out.println(list);
        System.out.println(taskTwo.dequeue(list));
        System.out.println(list);
        System.out.println(taskTwo.first(list));
        System.out.println(list);
    }
}
