package JAVA_DSA_Course;

public class TwoPointersSession5 {
    public static void main(String[] args) {
        // find the number of subarrays whos sum is less then or equal to k
        int arr[] = { 1, 1, 2, 2, 1, 1 };
        int k = 4;
        int n = arr.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;
        while (j < n) {//for(int i=0;j=0;j<n;j++) even we can use the for loop insted of while loop here both are exactly same
            sum += arr[j];
            while (sum > k) {
                sum -= arr[i];
                i++;
            }
            count += j - i + 1;
            j++;
        }
        System.out.println(count);

    }
}
