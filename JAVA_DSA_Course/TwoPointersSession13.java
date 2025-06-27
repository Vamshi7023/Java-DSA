package JAVA_DSA_Course;

public class TwoPointersSession13 {
    public static void main(String[] args) {
        int arr[] = {1,2,1,0,1,1,0};
        int k = 4;
        int n = arr.length;
        int sum = 0;
        int max = 0;
        int i=0;
        for (int j= 0; j< arr.length; j++){ //even we can use the for loop insted of while loop here both are exactly same         
            sum += arr[j];
            while (sum > k && i <= j) {
                sum -= arr[i];  // Subtract element at i
                i++;  // Move the left pointer to the right
            }

            // Calculate the maximum length of the subarray that has sum <= k
            if (sum <= k) {
                max = Math.max(max, j - i + 1);
            }
        }
        System.out.println(max);
    }
}
