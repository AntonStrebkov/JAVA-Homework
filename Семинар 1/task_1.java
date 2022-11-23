import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n),
 * n! (произведение чисел от 1 до n)
 */
public class task_1 {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        int triangularNumber = 0;
        double triangularNumber_test = (num * 0.5) * (num + 1);
        int factorial = 1;

        for (int i = 0; i <= num; i++) {
            triangularNumber += i;
        }
        for (int i = 1; i <= num; i++) {
            if (num == 1)
                factorial = 1;

            else
                factorial *= i;
        }
        System.out.println("Треугольное число: " + triangularNumber);
        System.out.println("Факториал (n!): " + factorial);
        System.out.println("Треугольное число по формуле: " + triangularNumber_test);
    }
}