package JAVA_DSA_Course;
public class dpsession16 {
    public static void main(String[] args) {
        int a[] = {1, 4, 20, 2};  // Easy tasks
        int b[] = {2, 10, 21, 23}; // Hard tasks
        int n = a.length;
        int[][] dp = new int[n + 1][4];
        // Base cases for the first day
        dp[1][1] = a[0];  // Choosing easy task on day 1
        dp[1][2] = b[0];  // Choosing hard task on day 1
        dp[1][3] = 0;     // Doing nothing on day 1
        // Fill dp table for each day from day 2 to day n
        for (int i = 2; i <= n; i++) {
            // Case 1: Doing an easy task on day i
            dp[i][1] = a[i - 1] + Math.max(dp[i - 1][1], Math.max(dp[i - 1][2], dp[i - 1][3]));

            // Case 2: Doing a hard task on day i
            dp[i][2] = b[i - 1] + dp[i - 1][3]; // Hard task only after doing nothing the previous day

            // Case 3: Doing nothing on day i
            dp[i][3] = 0 + Math.max(dp[i - 1][1], Math.max(dp[i - 1][2], dp[i - 1][3]));
        }
        // Correct final result
        System.out.println(Math.max(dp[n][1], Math.max(dp[n][2], dp[n][3])));
    }
}