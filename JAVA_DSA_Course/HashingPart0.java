package JAVA_DSA_Course;

import java.util.Scanner;

public class HashingPart0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {1, 1, 2, 3, 4};
        
        int q = 3;
        for (int i = 0; i < q; i++) {
            int count = 0;
            int target = s.nextInt();
            
            for (int j = 0; j < arr.length; j++) { 
                if (arr[j] == target) {  
                    count++;
                }
            }
            System.out.println(count);
        }
       
    }
}
