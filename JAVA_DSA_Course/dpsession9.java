package JAVA_DSA_Course;
import java.io.*;

import java.util.Scanner;

class dpsession9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }

        int[][] dp = new int[100005][3];

        if (a[1] % 2 == 0) {
            dp[1][2] = 1;//even sum sequence
        } else {
            dp[1][1] = 1;//odd sum sequence
        }

        int i = 2;
        while (i <= n) {
            if (a[i] % 2 == 0) {
                dp[i][2] = dp[i - 1][2] + dp[i - 2][2];
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
            } else {
                dp[i][2] = dp[i - 1][1] + dp[i - 2][1];
                dp[i][1] = dp[i - 1][2] + dp[i - 2][2];
            }
            i++;
        }
        System.out.println(dp[n][1] + " " + dp[n][2]);
        //for more in detail :https://chatgpt.com/share/675fc3d0-7dac-8000-a1bc-ee44e4268731
    }
}
