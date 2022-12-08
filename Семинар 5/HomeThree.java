import java.util.*;

public class HomeThree {
    public int arabicToRoman(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int end = s.length() - 1;
        char[] array = s.toCharArray();
        int arabic;
        int result = map.get(array[end]);
        for (int i = end - 1; i >= 0; i--) {
            arabic = map.get(array[i]);
            if (arabic < map.get(array[i + 1])) {
                result -= arabic;
            } else {
                result += arabic;
            }
        }
        return result;
    }
}

/*
Написать метод, который переведет число из римского формата записи в арабский.
Например, MMXXII = 2022 (правила см. во вложениях к уроку, где ссылка на репозиторий).
 */
