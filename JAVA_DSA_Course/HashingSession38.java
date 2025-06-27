package JAVA_DSA_Course;

import java.util.Scanner;

public class HashingSession38 {
    public static boolean function(int[] b, int n) {
        int[] p = new int[n + 1];
        int[] s = new int[n + 1];
        p[1] = b[1];
        s[n] = b[n];

        for (int i = 2; i <= n; i++) {
            p[i] = Math.min(b[i], p[i - 1]);//prifix array
        }

        for (int i = n - 1; i >= 1; i--) {
            s[i] = Math.max(b[i], s[i + 1]);//suffix array
        }

        for (int i = 2; i <= n - 1; i++) {
            if (p[i - 1] < b[i] && b[i] < s[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int a [] = {18, 5, 4 ,3 ,2, 1 ,8 ,10};
        int f = a.length;

        // int count=0;
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = i+1; j < a.length; j++) {
        //         for (int j2 = j+1; j2 < a.length; j2++) {
        //             if (a[i]<a[j]&&a[j]<a[j2]) {
        //                 count++;
        //                 System.out.println(a[i]+" "+a[j]+" "+a[j2]);
        //             }
        //         }
        //     }
        // }
        // System.out.println(count);

        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] b = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            b[i] = scanner.nextInt();
        }

        boolean result = function(b, n);
        System.out.println(result ? "True" : "False");
        
        scanner.close();
    }
}
