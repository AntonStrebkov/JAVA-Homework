import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HomeTwo {
    ArrayList<String> listWorking = new ArrayList<>();

    {
        listWorking.add("Иван");
        listWorking.add("Игорь");
        listWorking.add("Иван");
        listWorking.add("Дмитрий");
        listWorking.add("Сергей");
        listWorking.add("Игорь");
        listWorking.add("Иван");
        listWorking.add("Владимир");
        listWorking.add("Дмитрий");
        listWorking.add("Иван");
        System.out.println(listWorking);
        Map<String, Integer> mapName = new HashMap<>();
        for (String s : listWorking) {
            if (mapName.containsKey(s)) {
                mapName.replace(s, mapName.get(s) + 1);
            } else {
                mapName.put(s, 1);
            }
        }
        System.out.println(mapName);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : mapName.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : mapName.entrySet()) {
                String key = entry.getKey();
                if (mapName.get(key) == i) {
                    sortedNameMap.put(key, mapName.get(key));
                }
            }
        }
        System.out.println(sortedNameMap);
    }
}

/*
Пусть дан список сотрудников:Иван Иванов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
 */