package JAVA_DSA_Course;
public class dpsession11 {
    public static void main(String[] args) {
        // // pre requzite question
        // int n = 5;
        // int dp[] = new int[n + 1];
        // dp[1] = 0;

        // for (int i = 2; i < dp.length; i++) {
        //     int v1 = 1 + dp[i - 1];
        //     int v2 = Integer.MAX_VALUE;
        //     int v3 = Integer.MAX_VALUE;
        //     if (i % 2 == 0) {
        //         v2 = 1 + dp[i / 2];
        //     }
        //     if (i % 3 == 0) {
        //         v3 = 1 + dp[i / 3];
        //     }
        //     dp[i] = Math.min(v1, Math.min(v2, v3));
        // }

        // for (int i = 1; i < dp.length; i++) {  // Corrected loop condition
        //     System.out.println(dp[i]);
        // }

        //Uber oa question u can add 1 or do -1 to get the 1 as ans
        int n = 10;
        int dp [] = new int[n+1];
        dp[1]=0;
        dp[2] = 1;
        for (int i = 3; i < dp.length; i++) {
            if (i%2==0) {
                dp[i] = 1+dp[i-1];
            }
            else{
                dp[i] = Math.min(1+dp[i-1],2+dp[(i+1)/2]);//2+dp[(i+1)/2] --> 2+ because operations (1 for incrementing and 1 for dividing).
            }
        }
        System.out.println(dp[n]);
    }
}
