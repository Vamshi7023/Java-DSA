package JAVA_DSA_Course;

public class dpsession3 {
    // Max subset with no adjacent elements
    public static void main(String[] args) {
        int arr[] = {2, -3, 5, -8, 9};

        int dp[] = new int[arr.length];
        dp[0] = Math.max(arr[0], 0);
        dp[1] = Math.max(arr[1], dp[0]);

        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 1], arr[i] + dp[i - 2]);
        }

        System.out.println(dp[arr.length - 1]);
    }
}
