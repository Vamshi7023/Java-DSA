package JAVA_DSA_Course;
public class dpsession6 {
    public static void main(String[] args) {
        int a1 [] = {30,10,60,10,60,50};
        int n = a1.length;
        int dp[] = new int[n];
        dp[0]=0;
        dp[1]=Math.abs(a1[1]-a1[0]);
        for (int i = 2; i < a1.length; i++) {
            int a = Math.abs(a1[i-1]-a1[i])+dp[i-1];
            int b = Math.abs(a1[i-2]-a1[i])+dp[i-2];
            dp[i]=Math.min(a, b);
        }
        System.out.println(dp[n-1]);
    }
}
