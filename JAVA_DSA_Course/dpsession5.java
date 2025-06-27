package JAVA_DSA_Course;
public class dpsession5 {
    public static void main(String[] args) {
        int a1 [] = {4,12,13,18,10,12};
        int n = a1.length;
        int dp[] = new int[n];
        dp[0]=0;
        dp[1]=Math.abs(a1[1]-a1[0]);
        dp[2]=Math.abs(a1[1]-a1[2])+dp[1];//dp[1] is added because the cost from 1 to 2 is abs(a1[1]-a1[2]) and dp1 is the distance of 0 to 1
        for (int i = 3; i < a1.length; i++) {
            int a = Math.abs(a1[i-1]-a1[i])+dp[i-1];
            int b = Math.abs(a1[i-3]-a1[i])+dp[i-3];
            dp[i]=Math.min(a, b);
            System.out.println(i+" "+dp[i]);
        }
    }
}