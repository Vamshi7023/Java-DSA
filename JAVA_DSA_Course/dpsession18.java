package JAVA_DSA_Course;
public class dpsession18 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6};
        int n = arr.length;
        int dp[] = new int[n+1];
        dp[0]= 1;
        dp[1] =1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            if (i >= 4)
                dp[i] += dp[i - 4];
            if (i >= 6)
                dp[i] += dp[i - 6];
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }
    }

    
}
