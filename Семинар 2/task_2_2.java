import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class task_2_2 {
    public static void main(String[] args) throws IOException {
        /**
         * Реализуйте алгоритм сортировки пузырьком числового массива, результат после
         * каждой итерации запишите в лог-файл.
         */

        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = bubbleSort.createArray(6);
        int[] cortArr = bubbleSort.getSort(arr);
        bubbleSort.writeArray(cortArr);
    }

}

class BubbleSort {
    public int[] createArray(int num) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[num];
        System.out.println("Введите ряд из " + num + " чисел: ");
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        return arr;
    }

    public void writeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] getSort(int[] arr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("log.txt");
        try {
            for (int i = 0; i < arr.length; i++) {
                writeArray(arr);
                fileOutputStream.write(Arrays.toString(arr).getBytes());
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            fileOutputStream.close();
            return arr;
        } catch (Exception e) {
            return null;
        }
    }
}