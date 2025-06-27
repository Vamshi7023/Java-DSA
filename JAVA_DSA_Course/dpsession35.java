package JAVA_DSA_Course;

public class dpsession35 {
    public static void main(String[] args) {

        int a[] = { 0, 1, 2, 3, 4, 4 };
        int n = a.length;
        int k = 2;
        int dp[][] = new int[n][k+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0; // Base case: no cost for 0 elements and 0 partitions
    
        for (int prt = 1; prt <= k; prt++) {
            for (int i = 1; i < n; i++) {
                int max = 0;
                int j = i;
                while (j >= 1) { 
                    max = Math.max(max, a[j - 1]);
                    if (dp[j - 1][prt - 1] != Integer.MAX_VALUE) {
                        dp[i][prt] = Math.min(dp[i][prt], max + dp[j - 1][prt - 1]);
                    }
                    j--; // Decrementing j inside the while loop
                }
            }
        }
    
        System.out.println(dp[n-1][k]);

    }

    // Second video of dpsession35

    // public static void main(String[] args) {
    // int a[] = { 0, 1, 2, 3, 4, 5 };
    // int n = a.length;
    // int dp[] = new int[n + 1];
    // dp[0] = 1;
    // dp[1] = 1;
    // int k = 5;
    // int sum = 0;
    // int c = 1;
    // for (int i = 2; i < dp.length; i++) {
    // int currentSum = 0;
    // dp[i] = Integer.MAX_VALUE; // Initialize to a large value
    // for (int j = i; j > 0; j--) { // Iterate backward to find valid partitions
    // currentSum += a[j - 1]; // Add the current element to the sum
    // if (currentSum > k)
    // break; // If the sum exceeds k, stop
    // dp[i] = Math.min(dp[i], 1 + dp[j - 1]); // Update dp[i] with the minimum
    // partitions
    // }
    // }
    // System.out.println(dp[n]);

    // }
}
