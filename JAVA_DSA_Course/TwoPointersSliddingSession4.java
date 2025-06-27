package JAVA_DSA_Course;
import java.util.*;
public class TwoPointersSliddingSession4 {
    public static void main(String[] args) {
        //Brute force approach
        // int arr []= {0,0,8,8,5,8,0,0,5};
        // int k = 2;
        // int n=5;
        
        // int sub=0;
        // for (int i=0;i< arr.length; i++) {
        //     int count =0;
        //     for (int j = i; j < arr.length; j++) {
        //         if (arr[j]==n) {
        //             count++;
        //         }
        //         if (count==k) {
        //             sub++;
        //         }
        //     }
        // }
        // System.out.println(sub);


        //Efficent approach
        int arr[] = {0, 0, 0,5, 1,0,5, 0, 0, 0,5}; // Input array
        int count = 0; // This will count occurrences of 'n' (5) as we iterate
        int k = 2; // Target number of occurrences of 'n' we want in a subarray
        int n = 5; // The number we are looking for in the array
        int c = 0; // Holds the difference between current count and k
        int sum = 0; // This will accumulate the total count of valid subarrays
        
        // HashMap to store how many times each prefix count has occurred
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0, 1); // Initialize with 0 count to handle cases where count == k

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is equal to 'n', increment the count
            if (arr[i] == n) {
                count++; // Increment the count of occurrences of 'n'
            }
            
            // Calculate the required count of previous occurrences to find valid subarrays
            c = count - k; // `c` is the count of 'n's needed in earlier indices

            // Add to `sum` the number of times this target prefix count `c` has appeared
            // This indicates how many valid subarrays end at the current index
            sum += h.getOrDefault(c, 0); // If `c` is not found, use 0 as default
            
            // Update the map with the current count, incrementing the frequency of `count`
            h.put(count, h.getOrDefault(count, 0) + 1); // Increment the count in the map
        }

        // Output the total count of subarrays with exactly `k` occurrences of `n`
        System.out.println(sum);
    }
}
