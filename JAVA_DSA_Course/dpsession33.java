package JAVA_DSA_Course;
public class dpsession33 {
    // public static void main(String[] args) {
    //     int arr[] = {1, 2, 3, 4, 4};
    //     int n = arr.length;
    //     int m = 5;
    //     int dp[] = new int[n + 1];
    //     dp[0] = 1;
    //     dp[1] = 1;
    //     for (int i = 2; i <= n; i++) { // Use `n` instead of `dp.length`
    //         int j = i;
    //         int sum = arr[j - 1]; // Adjust index to `j - 1` to match array indexing
    //         while (sum <= m && j >= 1) {
    //             dp[i] += dp[j - 1];
    //             j--;
    //             if (j > 0) { // Avoid accessing out of bounds
    //                 sum += arr[j - 1]; // Adjust index to `j - 1`
    //             }
    //         }
    //     }
    //     System.out.println(dp[n]); // Print `dp[n]` for the result
    // }




    //-> Given an array of size ‘N’; find the number of ways to partition it such that the sum of each part is <=M ; but you should only make k partitions!
    public static void main(String[] args) {
        int a[] = {0, 1, 2, 3, 4, 4}; // Input array (1-indexed for simplicity)
        int n = a.length - 1;         // Number of elements (exclude the 0th index)
        int m = 5;                    // Maximum sum for each partition
        int k = 2;                    // Number of partitions
        int dp[][] = new int[n + 1][k + 1]; // DP table
    
        // Initialize base case
        dp[0][0] = 1; // 1 way to partition 0 elements into 0 partitions
    
        // Fill the dp table
        for (int i = 1; i <= n; i++) { // Loop over elements
            for (int part = 1; part <= k; part++) { // Loop over partitions
                int sum = 0;
                int j = i; // Start from the i-th element
                while (j >= 1) { // Try all subarrays ending at i
                    sum += a[j]; // Add current element to sum
                    if (sum > m) break; // If sum exceeds m, stop the loop
                    dp[i][part] += dp[j - 1][part - 1]; // Add valid ways to partition
                    j--; // Move to the previous element
                }
            }
        }
    
        // Output the result
        System.out.println(dp[n][k]); // Number of ways to partition the array
    }
       

}