package JAVA_DSA_Course;

public class HashingSession31 {
    public static void main(String[] args) {
        int a[] = { 5, -2, 3, 1, 2 };
        int n = a.length;
        int k = 3;
        int ans = Integer.MIN_VALUE;

        // Compute prefix sums
        int prefix[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + a[i - 1];
        }

        // Compute suffix sums
        int suffix[] = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + a[i];
        }

        // Compute max sum by picking i elements from the start and k-i from the end
        for (int i = 0; i <= k; i++) {
            int sum = prefix[i] + suffix[n - (k - i)];
            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
    }
}
