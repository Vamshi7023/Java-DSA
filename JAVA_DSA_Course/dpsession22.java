package JAVA_DSA_Course;
public class dpsession22 {
    public static void main(String[] args) {
        int easy[] = {0, 1, 45, 23, 88, 2, 6};
        int medium[] = {0, 12, 43, 55, 9, 0, 34};
        int hard[] = {0, 34, 1, 9, 23, 76, 71};

        int n = easy.length - 1; // Adjusting `n` to match 1-based indexing
        int dp_easy[] = new int[n + 1];
        int dp_medium[] = new int[n + 1];
        int dp_hard[] = new int[n + 1];

        // Base cases
        dp_easy[1] = easy[1];
        dp_medium[1] = medium[1];
        dp_hard[1] = hard[1];

        if (n >= 2) {
            dp_easy[2] = easy[2] + Math.max(dp_easy[1], Math.max(dp_medium[1], dp_hard[1]));
            dp_medium[2] = medium[2] + Math.max(dp_easy[1], Math.max(dp_medium[1], dp_hard[1]));
            dp_hard[2] = hard[2] + Math.max(dp_easy[1], Math.max(dp_medium[1], dp_hard[1]));
        }

        if (n >= 3) {
            dp_easy[3] = easy[3] + Math.max(dp_easy[2], Math.max(dp_medium[2], dp_hard[2]));
            dp_medium[3] = medium[3] + easy[2] + dp_medium[1];
            dp_hard[3] = hard[3] + easy[1] + Math.max(dp_easy[2], Math.max(dp_medium[2], dp_hard[2]));
        }

        // Transition for `i >= 4`
        for (int i = 4; i <= n; ++i) {
            dp_easy[i] = easy[i] + Math.max(dp_easy[i - 1], Math.max(dp_medium[i - 1], dp_hard[i - 1]));

            dp_medium[i] = medium[i] + easy[i - 1] + dp_medium[i - 2];

            int v1 = hard[i] + easy[i - 1] + dp_easy[i - 2];
            int v2 = Math.max(dp_hard[i], hard[i] + medium[i - 1] + easy[i - 2] + dp_medium[i - 3]);
            int v3 = Math.max(dp_hard[i], hard[i] + hard[i - 1] + easy[i - 2] + dp_easy[i - 3]);

            dp_hard[i]= Math.max(v1,Math.max(v2, v3));
        }

        // Find the maximum value at the last index
        int result = Math.max(dp_easy[n], Math.max(dp_medium[n], dp_hard[n]));
        System.out.print(result);
    }
}
