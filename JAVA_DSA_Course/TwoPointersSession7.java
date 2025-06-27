package JAVA_DSA_Course;

import java.util.Arrays;

public class TwoPointersSession7 {
    //Pre requezite 
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,4,5,6,7,8};
    //     int sum =0;
    //     int count = 0;
    //     int j= arr.length-1;
    //     int k = 6;
    //     for(int i=0;i<=j;){
    //         if(arr[i]+arr[j]<=k){
    //             count+=j-i+1;
    //             i++;
    //         }
    //         else{
    //             j--;
    //         }
    //     }
    //     System.out.println(count);
    // } 

    //Amazon SDE question
    //L<=(b[i]+b[j])<=R

    public static void main(String[] args) {
        int L = 3;  // Lower bound
        int R = 5;  // Upper bound

        int B[] = {0, 1, 2, 3, 4, 5, 6};  // Input array
        Arrays.sort(B);  // Sort the array to apply two-pointer approach
        int count = 0;  // To count the number of valid pairs

        int n = B.length;
        int i = 0;  // Left pointer
        int j = n - 1;  // Right pointer

        while (i < j) {
            int sum = B[i] + B[j];

            if (sum >= L && sum <= R) {  // Valid pair
                count += (j - i);  // Count all pairs between i and j
                i++;  // Move left pointer forward
            } else if (sum < L) {
                i++;  // If the sum is less than L, increase the sum by moving i forward
            } else {
                j--;  // If the sum is greater than R, decrease the sum by moving j backward
            }
        }

        System.out.println("Number of valid pairs: " + count);  // Output the result
    }
}
