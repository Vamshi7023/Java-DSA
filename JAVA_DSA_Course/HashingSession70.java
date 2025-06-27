package JAVA_DSA_Course;

// https://docs.google.com/document/d/1J6bePC6NK1bKkpTPPoplxLE0KkHHTdaROoPOyICXEcQ/edit?tab=t.0
import java.util.HashMap;
import java.util.Map;

public class HashingSession70 {
    // public static void main(String[] args) {
    // String a = "abcd"; // Given input string
    // int n = a.length(); // Length of the string

    // HashMap<Character, Integer> h = new HashMap<>(); // Map to store character
    // frequency across all substrings

    // // Loop through all possible substrings
    // for (int i = 0; i < n; i++) {
    // for (int j = i; j < n; j++) {
    // // Loop through characters in substring a[i..j-1] (note: this excludes a[j])
    // for (int j2 = i; j2 < j; j2++) {
    // // Count how many times each character appears across all substrings
    // h.put(a.charAt(j2), h.getOrDefault(a.charAt(j2), 0) + 1);
    // }
    // }
    // }

    // // Now, find the character with the maximum frequency
    // int max = 0;
    // char ans = 'a'; // Default answer character (if tie, lexicographically
    // smallest wins)

    // for (Map.Entry<Character, Integer> entry : h.entrySet()) {
    // char c = entry.getKey();
    // int freq = entry.getValue();

    // // If current frequency is greater than max found so far, update
    // // If equal frequency, choose the smaller character
    // if (freq > max || (freq == max && c < ans)) {
    // max = freq;
    // ans = c;
    // }
    // }

    // // Print the answer
    // System.out.println(ans);
    // }

    public static void main(String[] args) {
        String a = "abcd"; // Input string
        int n = a.length(); // Length of the string

        HashMap<Character, Integer> k = new HashMap<>(); // Map to store frequency of each character in all substrings

        // Iterate over each character in the string
        for (int i = 0; i < n; i++) {
            // x: number of characters to the left of index i (including current character
            // in substrings)
            int x = i;

            // y: number of characters to the right of index i (including current character
            // in substrings)
            int y = n - (i + 1);

            /**
             * The formula:
             * x * y + x + y + 1
             * simplifies to: (i + 1) * (n - i)
             * This represents the total number of substrings that include a.charAt(i)
             *
             * Explanation:
             * - For each character at position i,
             * it can be part of (i+1) starting positions (from 0 to i)
             * and (n - i) ending positions (from i to n-1)
             * - So total substrings in which a.charAt(i) appears = (i+1) * (n-i)
             */
            k.put(a.charAt(i), k.getOrDefault(a.charAt(i), 0) + x * y + x + y + 1);
        }

        // Now, find the character with the maximum frequency
        int max = 0;
        char ans = 'a'; // Default answer character (lexicographically smallest if tie)

        for (Map.Entry<Character, Integer> entry : k.entrySet()) {
            char c = entry.getKey(); // Current character
            int freq = entry.getValue(); // Total frequency across all substrings

            // Update max if current frequency is higher, or same frequency but smaller
            // character
            if (freq > max || (freq == max && c < ans)) {
                max = freq;
                ans = c;
            }
        }

        // Print the answer: character that appears the most across all substrings
        System.out.println(ans);
    }

}

// https://chatgpt.com/share/68590e2a-1cc8-8000-b5d7-7850397f90ec
