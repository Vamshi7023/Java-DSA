package JAVA_DSA_Course;

public class dpsession20 {
    public static void main(String[] args) {
        int a[] = {4,1,1,5,6};
        int n = a.length;
        int dp[][]= new int[n+1][4];
        dp[0][2]=0;//robbing 2 houses
        dp[0][3]=0;//robbing 3 houses
        dp[1][2]=a[0]+dp[0][2];
        dp[1][3]=a[0]+dp[0][2];
        for (int i = 2; i <= dp.length; i++) {
            dp[i][2] = a[i]+a[i-1]+dp[i-3][2];
            for (int j = 4; j < dp.length; j++) {
                dp[i][2]=a[i]+a[i-1]+Math.max(dp[j-4][2],dp[j-4][3]);
                //code shoud be writen more see the video again
            }
        }
    }
}
