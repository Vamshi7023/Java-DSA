package JAVA_DSA_Course;

public class dpsession19 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6}; // Costs for "last" positions
        int b[] = {1, 2, 3, 4, 5, 6}; // Costs for "second last" positions
        int n = a.length; // Length of the input array
        
        // DP Table: Rows = positions, Columns = {1 = last, 2 = second last}
        int dp[][] = new int[n][3]; // Using 3 columns for clarity
        
        // Base cases
        dp[0][1] = a[0]; // At position 0, cost for "last" is a[0]
        dp[0][2] = 0;    // At position 0, there is no "second last" (initialize to 0)
        
        if (n > 1) { // Base case for position 1
            dp[1][1] = a[1]; // Cost at position 1 using "last"
            dp[1][2] = a[0]; // Cost at position 1 using "second last"
        }
        
        // Fill DP table
        for (int i = 2; i < n; i++) {
            // Last position: Include current position cost and take minimum of the previous row
            dp[i][1] = a[i] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            
            // Second last position: Two cases
            // Case 1: Skip i-1 (use b[i-1]) and minimize cost at i-2
            int v1 = b[i - 1] + Math.min(dp[i - 2][1], dp[i - 2][2]);
            
            // Case 2: Use the second last cost at i-1 and include cost at i-1
            int v2 = dp[i - 1][2] + a[i - 1];
            
            dp[i][2] = Math.min(v1, v2);
        }
        
        // Result: Minimum cost at the last position (n-1)
        System.out.println("Last: " + dp[n - 1][1]);
        System.out.println("Second Last: " + dp[n - 1][2]);
    }
}
