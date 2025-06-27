package JAVA_DSA_Course;

public class HashingSession20 {
    public static int digitofsum(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 51, 71, 17, 42 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (digitofsum(arr[i]) == digitofsum(arr[j])) {
                    int sum = arr[j] + arr[i];
                    max = Math.max(max, sum);
                }
            }
        }
        System.out.println(max);
    }
}
