package JAVA_DSA_Course;
public class dpsession23 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int dp[] = new int[a.length];
        dp[0] = a[0];
        dp[1]=a[1];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1];
            if (dp[i-2]==2) {
                dp[i] = dp[i]+dp[i-2];
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }
    }
}
