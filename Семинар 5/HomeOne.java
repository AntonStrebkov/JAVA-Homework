import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HomeOne {
    public Map<Integer, String> newMap(Map<Integer, String> map) {
        map.put(8923456, "Иванов");
        map.put(8912356, "Петров");
        map.put(8912345, "Сидоров");
        map.put(89234586, "Иванов");
        map.put(89123596, "Петров");
        map.put(89123745, "Сидоров");
        return map;
    }

    public void phoneValue(Map<Integer, String> phonebook, String name) {

        for (Map.Entry<Integer, String> contact : phonebook.entrySet()) {
            if (contact.getValue().equals(name)) {
                System.out.println(contact.getKey());
            }
        }
    }
}
/*
Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.
 */
