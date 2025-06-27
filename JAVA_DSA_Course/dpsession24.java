package JAVA_DSA_Course;

public class dpsession24 {
    public static void main(String[] args) {
        // Brute force approach

        // String s = "abbaxyz";
        // int n = s.length();
        // int count=0;
        // for (int i = 0; i < s.length(); i++) {
        // for (int j = i; j < s.length(); j++) {

        // int st = i;
        // int e = j;
        // Boolean ispal=true;
        // while (st<e) {
        // if (s.charAt(st)!=s.charAt(e)) {
        // ispal = false;
        // }
        // st++;
        // e--;

        // }
        // if (ispal) {
        // count++;
        // }
        // }
        // }
        // System.out.println(count);

        // Dp approach to count the number of palindrom substrings

        String s = "abbaxyz";
        int n = s.length();
        int count = 0;
        int max = 0;

        // Create a dynamic dp array
        int[][] dp = new int[n][n];

        // For substrings of length = 1 (all single characters are palindromes)
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1; // Mark as palindrome
            count++;
            max = 1; // Max length of palindromic substring so far
        }

        // For substrings of length = 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1; // Mark as palindrome
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
                    count++;
                    max = Math.max(max, length); // Update max length
                }
            }
        }

        System.out.println("Total palindromic substrings: " + count);
        System.out.println("Length of the longest palindromic substring: " + max);

        // Dp approach to count the number of palindrom subsequence

        // String s = "abbaxyz";
        // int n = s.length();
        // int max = 0;
        // int count_subsequence=0;

        // // Create a dynamic dp array
        // int[][] dp = new int[n][n];

        // // For substrings of length = 1 (all single characters are palindromes)
        // for (int i = 0; i < n; i++) {
        // dp[i][i] = 1;
        // }

        // // For substrings of length = 2
        // for (int i = 0; i < n - 1; i++) {
        // if (s.charAt(i) == s.charAt(i + 1)) {
        // dp[i][i + 1] = 3;

        // }
        // else{
        // dp[i][i+1]=2;
        // }
        // }

        // // For substrings of length >= 3
        // for (int length = 3; length <= n; length++) { // Length of current substring
        // for (int i = 0; i <= n - length; i++) { // Starting index of substring
        // int j = i + length - 1; // Ending index of substring

        // // Check if the substring is a palindrome
        // if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
        // dp[i][j] = 1; // Mark as palindrome
        // count++;
        // max = Math.max(max, length); // Update max length
        // }
        // }
        // }

        // System.out.println("Total palindromic substrings: " + count);
        // System.out.println("Length of the longest palindromic substring: " + max);

    }
}
