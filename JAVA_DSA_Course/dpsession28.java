package JAVA_DSA_Course;

public class dpsession28 {
    // Function to calculate the sum of a subarray from index l to r (inclusive)
    public static int sum(int a[], int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[] = {1, 8,2,10};
        int dp[][] = new int[10][10];
        int n = a.length;

        // Initialize the cost for subarrays of length 1 (diagonal elements)
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0; // No cost for a single element
        }

        // Initialize the cost for subarrays of length 2
        for (int i = 0; i < n - 1; i++) {
            dp[i][i + 1] = a[i] + a[i + 1]; // Cost of merging two adjacent elements
        }

        // Calculate the minimum cost for subarrays of length >= 3
        for (int length = 3; length <= n; length++) { // Iterate over all subarray lengths >= 3
            for (int i = 0; i <= n - length; i++) { // Starting index of the subarray
                int j = i + length - 1; // Ending index of the subarray
                dp[i][j] = Integer.MAX_VALUE;

                // Try all possible partitions within [i, j]
                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + sum(a, i, j); // Cost of merging
                    dp[i][j] = Math.min(dp[i][j], cost); // Update the minimum cost
                }
            }
        }

        // Output the minimum cost to merge the entire array
        System.out.println(dp[0][n - 1]);
    }
}
