package JAVA_DSA_Course;
import java.util.*;
public class dpsession27 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        //count the number of palindrom present in the perticular range l to r
        String s = "bbcb";
        int n = s.length();
        int count = 0;
        int max = 0;

        // Create a dynamic dp array
        int[][] dp = new int[n][n];
        int[][] dp1 = new int[10][10];//count the number of pall in range arrray

        // For substrings of length = 1 (all single characters are palindromes)
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1; // Mark as palindrome
            dp1[i][i] = 1;
            count++;
            max = 1; // Max length of palindromic substring so far
        }

        // For substrings of length = 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1; // Mark as palindrome
                dp1[i][i] = dp1[i][i]+dp[i+1][i+1]+dp[i][i+1];
                count++;
                max = 2; // Update max length
            }
        }
        // For substrings of length >= 3
        for (int length = 3; length <= n; length++) { // Length of current substring
            for (int i = 0; i <= n - length; i++) { // Starting index of substring
                int j = i + length - 1; // Ending index of substring

                // Check if the substring is a palindrome
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1; // Mark as palindrome
                    dp1[i][j] = dp1[i][j-1] + dp1[i+1][j] - dp1[i+1][j-1] + dp[i][j]; 
                    count++;
                    max = Math.max(max, length); // Update max length
                }
            }
        }

        // Process queries
        System.out.println("Enter the number of queries:");
        int q = S.nextInt(); // Number of queries

        for (int i = 0; i < q; i++) {
            System.out.println("Enter the range (l and r):");
            int l = S.nextInt(); // Left index
            int r = S.nextInt(); // Right index

            // Validate the range
            if (l >= 0 && r < n && l <= r) {
                System.out.println("Count of palindromes in range [" + l + ", " + r + "]: " + dp1[l][r]);
            } else {
                System.out.println("Invalid range. Please ensure 0 <= l <= r < " + n);
            }
        }

    }
}