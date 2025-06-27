package JAVA_DSA_Course;
public class dpsession7 {
    public static void main(String[] args) {
        int a[] = {10,-8,20,40,-10,100,60,-30};
        int n = a.length;
        int dp[] = new int[a.length];
        dp[0]=a[0];
        dp[1]=a[0]+a[1];
        dp[2]=dp[1]+a[2];
        dp[3]=Math.max(dp[3-3]+a[3],dp[2]+a[3]);
        dp[4]=Math.max(dp[4-3]+a[4],dp[3]+a[4]);
        for (int i = 5; i < dp.length; i++) {
            dp[i]=Math.max(dp[i-1]+a[i],Math.max(dp[i-3]+a[i], dp[i-5]+a[i]));
        }
        System.out.println(dp[n-1]);
    }
}