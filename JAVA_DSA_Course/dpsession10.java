package JAVA_DSA_Course;
public class dpsession10 {
    public static void main(String[] args) {
        int x = 100 ;//cost to do -1
        int y = 30;//cost to divide 3
        int z = 70;//cost to divide 5
        int e = 40;//cost to divide 7
        int n = 8;
        int dp[] = new int[n+1];        
        dp[1]=0;//no cost is needed to convert 1 to 1 so dp[i]=0    
        for (int i = 2; i <=n; i++) {
            int v1 = dp[i-1]+x;
            int v2 = Integer.MAX_VALUE;
            int v3 = Integer.MAX_VALUE;
            int v4 = Integer.MAX_VALUE;
            if (i%7==0) {
                v2 = dp[i/7]+e;
            }
            if (i%3==0) {
                v3 = dp[i/3]+y;
            }
            if (i%5==0) {
                v4 = dp[i/5]+z;
            }
            dp[i] = Math.min(v1,Math.min(v2,Math.min(v3, v4)));
        }
        System.out.println(dp[n]);
        //more detail: https://chatgpt.com/share/675ff31d-3eb8-8000-95a4-61371259fb94
    }
}