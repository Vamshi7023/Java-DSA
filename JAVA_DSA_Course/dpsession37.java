package JAVA_DSA_Course;

public class dpsession37 {
    public static void main(String[] args) {
        int a[]= {0,3,5,2,1,9};
        int b[] = {0,1,1,10,5,3};
        int n = a.length-1;
        int dp [] = new  int[n+1];
        dp[0]=0;
        dp[1] = a[1];
        dp[2] = Math.min(a[1]+a[2], b[1]+b[2]);
        
    }
}
