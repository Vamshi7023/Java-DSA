package JAVA_DSA_Course;

import java.util.*;

public class TwopointersSession6 {

    // These is the session 8 in table now

    // BRUTE FORCE APPROACH

    // public static void main(String[] args) {
    // int arr[] = { 3, 2, 4, 5, 2, 6, 7, 8, 9, 10 };
    // HashMap<Integer, Integer> h = new HashMap<>();
    // int count = 0;
    // for (int i = 0; i < arr.length; ++i) {
    // h.clear();
    // for (int k = i; k < arr.length; ++k) {

    // if (!h.containsKey(arr[k])) {
    // h.put(arr[k], 1);
    // int v = k - i + 1;
    // count = Math.max(count, v);
    // } else {
    // break;
    // }
    // }
    // }
    // System.out.println(count);
    // }

    // PROPER APPROACH
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 2, 6, 7, 8, 9, 10 };
        HashMap<Integer, Integer> h = new HashMap<>();
        int count = 0;
        int j = 0;
        int i = 0;
        int n = arr.length;
        while (i < n && j < n) {
            if (!h.containsKey(arr[i])) {
                h.put(arr[i], i);
                int l = i - j + 1;
                count = Math.max(count, l);
                i++;
            } else {
                int a = h.get(arr[i]);
                while (j <= a) {
                    h.remove(arr[j]);
                    j++;
                }
                j = a + 1;
                h.put(arr[i], i);
                i++;
            }
        }
        System.out.println(count);
    }
}
