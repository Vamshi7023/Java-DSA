package JAVA_DSA_Course;
public class dpsession4 {
    public static void main(String[] args) {
        int a1[] = {2,3,4,-8,2};
        int a2[] = {-5,8,3,1,-4};
        int dp[] = new int[a1.length+1];
        dp[0]=Math.max(a1[0],a2[0]);
        dp[1]=Math.max(dp[1],Math.max(a1[1],a2[1]));
        for (int i = 2; i < a1.length; i++) {
            int a=dp[i-1];
            int b=dp[i-2]+a1[i];
            int c=dp[i-2]+a2[i];
            dp[i]=Math.max(a, Math.max(b, c));
            System.out.println(i+" " + dp[i]);
        }
    }
}
