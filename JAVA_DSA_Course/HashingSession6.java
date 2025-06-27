package JAVA_DSA_Course;

public class HashingSession6 {
    public static void main(String[] args) {
        int arr[] = {3,-1,2,-2,4,3};
        int k = 4;
        int count = 0;

        // // Count the number of elements equal to k
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == k) {
        //         count++;
        //     }
        // }

        // Count the number of subarrays that sum up to k
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int h = i; h < arr.length; h++) {
                sum += arr[h];
                if (sum == k) {
                    count++;
                    System.out.println(i+" "+ h);
                }
                
            }
            
        }

        System.out.println(count);
    }
}
