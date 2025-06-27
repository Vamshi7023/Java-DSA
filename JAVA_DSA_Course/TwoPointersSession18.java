package JAVA_DSA_Course;

public class TwoPointersSession18 {
    public static void main(String[] args) {
        int arr[] = { 5, 5, 6, 8, 7, 6, 5, 5 };
        int g = 5;
        int k = 2;
        int count = 0;
        int max = Integer.MIN_VALUE;
        count = 0; // Reset count for each new starting point (i)
        for (int l = 0, i = 0; l < arr.length; l++) {
            if (arr[l] == g) {
                count++;
            }
            if (count > k) {
                i++;
                break;
            } else
                max = Math.max(max, l - i + 1);
        }
        System.out.println("The longest subarray length is: " + max);
    }
}