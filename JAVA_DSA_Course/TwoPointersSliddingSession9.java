package JAVA_DSA_Course;

import java.util.HashMap;

public class TwoPointersSliddingSession9 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 7, 4, 3, 6 };
        HashMap<Integer, Integer> h = new HashMap<>();
        int k = 3;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0, j = 0; j < arr.length; j++) {
            if (h.containsKey(arr[j])) {
                int newStart = h.get(arr[j]) + 1;
                while (i < newStart) {
                    sum -= arr[i];
                    i++;
                }
            }
            sum += arr[j];
            h.put(arr[j], j); 
            if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
            }
        }
        System.out.println(max);
    }
}
