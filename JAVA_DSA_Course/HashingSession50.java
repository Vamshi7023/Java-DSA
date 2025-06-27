package JAVA_DSA_Course;

public class HashingSession50 {
    public static void main(String[] args) {
        int a [] = {5,-8,1,1,3};
        int n = a.length;
        int prefix [] = new int[n];
        prefix[0] = a[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]  = Math.max(a[i], prefix[i-1]+a[i]);
        }
        for (int i = 0; i < prefix.length; i++) {
            System.out.println(prefix[i]);
        }
    }
}
