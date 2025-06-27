package JAVA_DSA_Course;

import java.util.*;

public class HashingSession73 {
    public static int getMinimumConversionCost(String s) {
        int n = s.length();

        // Arrays to store the prefix and suffix conversion costs
        int[] prefixA = new int[n + 5]; // Cost to convert first i characters to 'a'
        int[] prefixB = new int[n + 5]; // Cost to convert first i characters to 'b'
        int[] suffixA = new int[n + 15]; // Cost to convert last i characters to 'a'
        int[] suffixB = new int[n + 15]; // Cost to convert last i characters to 'b'

        // Initialize prefix for first character
        if (s.charAt(0) == 'b') {
            prefixA[0] = 1; // flip to 'a'
            prefixB[0] = 0; // already 'b'
        } else {
            prefixA[0] = 0; // already 'a'
            prefixB[0] = 1; // flip to 'b'
        }

        // Build prefixA and prefixB arrays
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'a') {
                prefixA[i] = prefixA[i - 1]; // no cost to keep 'a'
                prefixB[i] = prefixB[i - 1] + 1; // flip 'a' to 'b'
            } else {
                prefixA[i] = prefixA[i - 1] + 1; // flip 'b' to 'a'
                prefixB[i] = prefixB[i - 1]; // no cost to keep 'b'
            }
        }

        // Initialize suffix for last character
        if (s.charAt(n - 1) == 'a') {
            suffixB[n - 1] = 1; // flip to 'b'
            suffixA[n - 1] = 0; // already 'a'
        } else {
            suffixB[n - 1] = 0; // already 'b'
            suffixA[n - 1] = 1; // flip to 'a'
        }

        // Build suffixB and suffixA arrays
        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == 'a') {
                suffixB[i] = suffixB[i + 1] + 1; // flip to 'b'
                suffixA[i] = suffixA[i + 1]; // no cost
            } else {
                suffixB[i] = suffixB[i + 1]; // no cost
                suffixA[i] = suffixA[i + 1] + 1; // flip to 'a'
            }
        }

        // Find the minimum cost to convert into valid form
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            // Option 1: first i letters to 'a', rest to 'b'
            int cost1 = prefixA[i] + suffixB[i + 1];
            // Option 2: first i letters to 'b', rest to 'a'
            int cost2 = prefixB[i] + suffixA[i + 1];

            // Keep track of minimum cost
            result = Math.min(result, Math.min(cost1, cost2));
        }

        return result;
    }

    public static void main(String[] args) {
        // Sample test string
        String s = "ababbbabbbbbbbbbbbbbb";
        int minCost = getMinimumConversionCost(s);
        System.out.println("Minimum Cost: " + minCost);
    }
}
