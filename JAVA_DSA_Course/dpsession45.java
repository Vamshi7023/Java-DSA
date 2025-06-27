package JAVA_DSA_Course;

public class dpsession45 {
    public static boolean check(int i,int j){

    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int n = a.length;
        int dp[] = new int[n+1];
        dp[1]=1;
        dp[0]=1;
        for (int i = 2; i < dp.length; i++) {
            int j=i;
            while (j>=1) {
                if(check(i,j)==true){
                    if (j==1) {
                        dp[i] = Math.max(dp[i], 1);
                    }
                    if (dp[j-1]>=1) {
                        dp[i] = Math.max(dp[i], dp[j-1]);
                    }
                }
                j--;
            }
        }
    }
}
