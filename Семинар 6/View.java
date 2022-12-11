import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    public void printHello() {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1, "Model");
        userMap.put(2, "Color");
        userMap.put(3, "RAM");
        userMap.put(4, "HDD");
        System.out.println("Выберите нужную характеристику: \n" +
                "1. Model\n2. Color\n3. RAM\n4. HDD");
    }

    public void choiceUser() {
        printHello();
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.println("Какая модель? ");
            String model = in.next();
        } else if (choice == 2) {
            System.out.println("Какой цвет? ");
            String color = in.next();
        } else if (choice == 3) {
            System.out.println("Объем RAM: ");
            int ram = in.nextInt();
        } else System.out.println("Объем HDD: ");
        int hdd = in.nextInt();
    }
}
