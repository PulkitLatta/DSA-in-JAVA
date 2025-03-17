package Arrays;

import java.util.ArrayList;

public class Union_of_2_Sorted_with_Duplicates {
    static ArrayList<Integer> findUnion(int[] a, int b[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = a.length, m = b.length;
        int i = 0, j = 0;

        while (i < n && j < m) {

            while (i > 0 && i < n && a[i] == a[i - 1]) {
                i++;
            }

            while (j > 0 && j < m && b[j] == b[j - 1]) {
                j++;
            }

            if (i < n && j < m) {
                if (a[i] < b[j]) {
                    list.add(a[i]);
                    i++;
                } else if (a[i] > b[j]) {
                    list.add(b[j]);
                    j++;
                } else {
                    list.add(a[i]);
                    i++;
                    j++;
                }
            }
        }


        while (i < n) {
            if (i == 0 || a[i] != a[i - 1]) {
                list.add(a[i]);
            }
            i++;
        }


        while (j < m) {
            if (j == 0 || b[j] != b[j - 1]) {
                list.add(b[j]);
            }
            j++;
        }

        return list;
    }
}
