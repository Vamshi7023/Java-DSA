package JAVA_DSA_Course;
import java.util.Scanner;
public class dpsession15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b[] = new int[n+1];
        int c[] = new int[n+1];
        int i=1;
        while (i<=n) {
            b[i]=s.nextInt();
			c[i]=s.nextInt();
			i++;
        }
        // Only need dp of size [n+1][3][3] given n = 5
        int dp[][][] = new int[100000+5][5][5];
        // Initialize base cases
        dp[1][1][1] = b[1];
        dp[1][1][2] = b[1];
        dp[1][2][1] = c[1];
        dp[1][2][2] = c[1];
        // Fill the dp table
        for ( i = 2; i <= n; i++) {
            dp[i][1][1] = b[i] + b[i - 1] + Math.max(dp[i - 2][2][1], dp[i - 2][2][2]);
            dp[i][2][2] = c[i] + c[i - 1] + Math.max(dp[i - 2][1][1], dp[i - 2][1][2]);
            dp[i][1][2] = b[i] + c[i - 1] + Math.max(dp[i - 2][1][1], Math.max(dp[i - 2][1][2], dp[i - 2][2][1]));
            dp[i][2][1] = c[i] + b[i - 1] + Math.max(dp[i - 2][2][2], Math.max(dp[i - 2][2][1], dp[i - 2][1][2]));
        }
        // Find the maximum value for the nth index
        int result = Math.max(dp[n][1][1], Math.max(dp[n][1][2], Math.max(dp[n][2][1], dp[n][2][2])));
        System.out.println(result);
    }
}