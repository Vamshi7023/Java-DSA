package JAVA_DSA_Course;

public class HashingSession48 {
    public static void main(String[] args) {
        int a [] = {2,3,5,4,3,2,1};
        int n = a.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int max = 0;
        int max1=0;
        prefix[0]=1;
        for (int i = 1; i < prefix.length; i++) {
            if (a[i-1]<a[i]) {
                prefix[i] = prefix[i-1]+1;
            }
            else{
                prefix[i] = 1;
            }
        }
        // for (int i = 0; i < prefix.length; i++) {
        //     System.out.println(prefix[i]);
        // }
        suffix[n-1] =1;
        for (int i = n-2; i >=0; i--) {
            if (a[i]>a[i+1]) {
                suffix[i] = suffix[i+1]+1;
            }
            else{
                suffix[i]=1;
            }
        }
        // for (int i = 0; i < suffix.length; i++) {//Find the largest mountain in the array
        //     max = Math.max(max, prefix[i]+suffix[i]-1);
        // }
        // System.out.println(max);

        for (int i = 0; i < n; i++) {//Calculate the number of mountains whose topmost is index “i”
            max1 += (suffix[i]-1)*(prefix[i]-1);
        }
        System.out.println(max1);
    }
}
