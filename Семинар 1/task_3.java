import java.util.Scanner;

/**
 * task_3
 */
public class task_3 {

    public static void main(String[] args) {
        boolean exit = true;
        int res;
        while (exit == true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Операции калькулятора:\n1. Сложение\n" +
                    "2. Вычитание\n3. Умножение\n4. Деление\n" +
                    "5. Выход\nВыберите операцию: ");
            int calc = in.nextInt();

            System.out.println("Введите число a: ");
            int a = in.nextInt();
            System.out.println("Введите число b: ");
            int b = in.nextInt();

            if (calc == 1) {
                res = a + b;
                System.out.println(a + " + " + b + " = " + res);
            } else if (calc == 2) {
                res = a - b;
                System.out.println(a + " - " + b + " = " + res);
            } else if (calc == 3) {
                res = a * b;
                System.out.println(a + " * " + b + " = " + res);
            } else if (calc == 4) {
                res = a / b;
                System.out.println(a + " / " + b + " = " + res);
            } else if (calc == 5) {
                exit = false;
                System.out.println("Всего доброго!");
                in.close();
            } else {
                System.out.println("Введите правильную операцию!");
            }
        }
    }
}