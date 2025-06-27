package JAVA_DSA_Course;

import java.util.*;

public class HashingSession51 {
    public static void main(String[] args) {

        // Brute force approach

        // int a[] = { 5, 2, 3, 5 };
        // int count = 0;
        // for (int i = 0; i < a.length; i++) {
        // for (int j = i + 1; j < a.length; j++) {
        // int sum = 0;
        // for (int k = i + 1; k < j; k++) {
        // sum += a[k];
        // }
        // if (a[i] == sum && a[j] == sum) {
        // count++;
        // }
        // }
        // }
        // System.out.println(count);

        // optimized approach
        int a[] = {5, 2, 3, 5};
        int n = a.length;
        int count = 0;
        long prefixSum = 0;
        Map<Long, Integer> map = new HashMap<>();

        // Store initial prefix sum (important for checking sums from the start)
        map.put(0L, -1);

        for (int i = 0; i < n; i++) {
            prefixSum += a[i];

            // Check if a valid subarray exists between two same elements
            if (map.containsKey(prefixSum - a[i])) {
                int startIndex = map.get(prefixSum - a[i]);  // Previous occurrence index
                if (a[startIndex + 1] == a[i]) {  // Ensure elements between match condition
                    count++;
                }
            }

            map.put(prefixSum, i);  // Store prefix sum
        }

        System.out.println(count);
    }
}
