package JAVA_DSA_Course;

public class dpsession46 {
    public static void main(String[] args) {
        int a[] = {-2, 1, -3};
        int n = a.length;

        int dp[] = new int[n + 1];
        dp[0] = 1; // Base case: There's 1 way to partition an empty subarray.

        for (int i = 1; i <= n; i++) {
            int j = i; // Start checking subarrays ending at i.
            boolean hasNegative = false; // Track if the current subarray has a negative number.

            while (j >= 1) {
                if (a[j - 1] < 0) {
                    hasNegative = true; // Mark that the subarray contains a negative number.
                }

                // If there's at least one negative number, add dp[j-1] to dp[i].
                if (hasNegative) {
                    dp[i] += dp[j - 1];
                }

                j--; // Move to the previous element.
            }
        }

        System.out.println(dp[n]); // Output the total number of valid partitions for the array.
    }
     //For optimization we need to remove the while loop for o(n) time complexibility when ever we are getting the +ve number we no need to run the while while loop so just runing the the loop when -ve is there then its enough so eleminating the while loop
}
