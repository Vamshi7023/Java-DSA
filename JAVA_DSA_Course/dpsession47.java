import java.util.HashMap;
import java.util.Scanner;

public class dpsession47 {

    // Check function to validate if the map values are within constraints
    public static boolean check(HashMap<Character, Integer> map, int[] a, int i) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (map.getOrDefault(c, 0) > a[i]) {
                return false; // Constraint violated
            }
        }
        return true; // All constraints satisfied
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input size n and the string s
        int n = sc.nextInt();
        String s = sc.next();
        
        // Read the array a (constraints for each index)
        int[] a = new int[n + 1]; // 1-based indexing
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        // Initialize dp array
        long[] dp = new long[n + 1];
        dp[0] = 1;

        // Dynamic programming loop
        for (int i = 1; i <= n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j >= 1; j--) {
                // Update character frequency in the current substring [j...i]
                char currentChar = s.charAt(j - 1); // 1-based index, so j-1
                map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

                // Check if the substring [j...i] satisfies constraints
                if (check(map, a, i)) {
                    dp[i] += dp[j - 1];
                } else {
                    break; // Stop further processing as constraints are violated
                }
            }
        }

        // Output the result
        System.out.println(dp[n]);
        sc.close();

        //Had done these video till approx 40:min only still lot to do
    }
}
