package JAVA_DSA_Course;
public class dpsession43 {
    public static int number(String s, int i, int j) {
        // Convert substring to integer
        return Integer.parseInt(s.substring(i, j + 1));
    }
    public static void main(String[] args) {
        int k = 24;  // Threshold value
        String s = "125";
        int n = s.length();
        int a[] = new int[n + 1];
        int dp[] = new int[n + 1];

        // Fill the array `a[]` with numeric values from the string `s`
        for (int i = 1; i <= n; i++) {
            a[i] = Character.getNumericValue(s.charAt(i - 1));
        }

        // Initialize base case for dp
        dp[0] = 1;  // There's one way to form an empty string

        // Populate dp array
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                // Ensure indices are valid for substring
                if (j - 1 >= 0 && number(s, j - 1, i - 1) < k) {
                    dp[i] += dp[j - 1];
                }
            }
        }
        // Output result
        System.out.println(dp[n]);
    }
}
