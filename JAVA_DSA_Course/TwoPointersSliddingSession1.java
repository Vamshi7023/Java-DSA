package JAVA_DSA_Course;

public class TwoPointersSlidingSession1 {
    public static void main(String[] args) {
        int arr[] = { 100, 200, 300, 400 };
        int max = Integer.MIN_VALUE;
        int i = 0, j = 0;
        int k = 2;
        int a=0;
        while (j<arr.length) {
            a+=arr[j];
            if (j - i + 1 == k) {
                max = Math.max(max, a);
                a-=arr[i];
                i++;
            }
            j++;
        }
        System.out.println(max);
    }
}
