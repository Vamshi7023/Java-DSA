package JAVA_DSA_Course;
public class dpsession2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int dp[] = new int[arr.length+1];
        int i=0;
        while (i<arr.length) {
            if (i==0) {
                dp[i]=arr[i];
            }
            else{
                dp[i] = arr[i]+dp[i-1];
            }
            i++;
        }
        int q = 5;
        int w[] = {0,1,2,3,4};
        int j=0;
        while (j<q) {
            int query = w[j];
            System.out.println(dp[query]);
            j++;
        }
    }
}