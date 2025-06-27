package JAVA_DSA_Course;
public class HashingSession60 {
    public static void main(String[] args) {
        int a [] = {8,2,1,3,5,1,10};
        int k = 3;
        int max = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            max = a[i];
            for (int j = i; j < a.length; j++) {
                max = Math.max(max, a[j]);
                if (max == k ) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}