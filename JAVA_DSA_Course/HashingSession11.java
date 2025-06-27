package JAVA_DSA_Course;

public class HashingSession11 {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 4, 5, 6};
        // int p[] = new int[arr.length + 1];
        
        // for (int i = 0; i < arr.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j >= 0; j--) {
        //         sum += arr[j];  // Adding arr[j] to sum for each subarray
        //     }
        //     p[i] = sum;  // Storing the subarray sum in p[i]
        // }
        
        // // Print the result array p
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("p[" + i + "] = " + p[i]);
        // }


        //Kadane’s algo for finding max sum sub array
        // int arr[] = {10,3,100,-14,-34,20};
        // int t =0;
        // int prev = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     int current = Math.max(prev+arr[i],Math.max(arr[i],0));
        //     prev = current;
        //     t = Math.max(t,current);
        // }
        // System.out.println(t);

        int arr[] = {10,3,100,-14,-34,20};
        int k=1;
        int t =0;
        int prev = 0;
        int n=1;
        while(k>=1){
            for (int i = 0; i <k; i++) {
                int current = Math.max(prev+arr[i],Math.max(arr[i],0));
                prev = current;
                t = Math.max(t,current);
            }
            System.out.println(t);
            k++;
        }
        int g = k+1;
        while(g<=arr.length){
            for (int i = arr.length-1; i >=g; i--) {
                int current = Math.max(prev+arr[i],Math.max(arr[i],0));
                prev = current;
                t = Math.max(t,current);
            }
            System.out.println(t);
            k++;
        }
        
    }
}
