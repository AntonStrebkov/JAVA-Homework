import java.util.Arrays;

public class MergeSort {

        public void sort (int[]array)
        {
            int[] supportArray = Arrays.copyOf(array, array.length);
            int n = array.length;
            for (int size = 1; size < n; size *= 2) {
                for (int j = 0; j < n - size; j += 2 * size) {
                    merge (array, supportArray, j, j + size - 1,
                            j + size, Math.min (j + 2 * size - 1, n - 1));
                }
                System.out.println(Arrays.toString(array));
            }
        }
        public void merge (int[]array, int[]supportArray, int ls, int le,
                                  int rs, int re) {
            for (int i = ls; i <= re; i++) {
                supportArray[i] = array[i];
            }
            int l = ls;
            int r = rs;

            for (int i = ls; i <= re; i++) {
                if (l > le) {
                    array[i] = supportArray[r];
                    r++;
                } else if (r > re) {
                    array[i] = supportArray[l];
                    l++;
                } else if (supportArray[l] < supportArray[r]) {
                    array[i] = supportArray[l];
                    l++;
                } else {
                    array[i] = supportArray[r];
                    r++;
                }
            }
        }
    }
/*
Реализовать алгоритм сортировки слиянием
 */
