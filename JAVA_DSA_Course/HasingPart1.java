package JAVA_DSA_Course;

import java.util.Scanner;

public class HasingPart1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
 
 
        int[] array = new int[n];
        int[] hash = new int[51];
 
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            hash[array[i]]=hash[array[i]] + 1;//Created a hash array
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int query = scanner.nextInt();
            int count = hash[query];
            System.out.println(count);
        }
    }
}
