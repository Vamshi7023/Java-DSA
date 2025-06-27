package JAVA_DSA_Course;

public class HashingSession49 {
    public static void main(String[] args) {
        int a[] = { 5, 3, 1, 8, 10 };
        int n = a.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        
        prefix[0] = 1;
        for (int i = 1; i <n; i++) {
            if (a[i-1] > a[i]) {
                prefix[i] = prefix[i - 1] + 1;
            }
            else{
                prefix[i]= 1;
            }
        }
        suffix[n-1] =1;
        for (int i =n-2; i>=0; i--) {
            if (a[i]<a[i+1]) {
                suffix[i] = suffix[i+1]+1;
            }
            else{
                suffix[i]= 1;
            }
        }
        int max= 0 ;
        for (int i = 0; i < n; i++) {
            max += (prefix[i]-1) * (suffix[i]-1);
        }
        System.out.println(max);
    }
}
