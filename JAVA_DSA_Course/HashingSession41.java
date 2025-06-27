package JAVA_DSA_Course;

public class HashingSession41 {
    public static void main(String[] args) {
        int a[] = { 0, 4, 2, 3, 7 };
        int n = a.length - 1;
        int x = 2;
        int y = 2;
        int ans = Integer.MAX_VALUE;
        int prifix[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i >= 1) {
                prifix[i] = a[i] + (i - y > 1 ? prifix[i - y] : 0);
            } else {
                prifix[i] = Integer.MAX_VALUE;
            }
        }
        for (int i = y*x; i < n; i++) {
            int g = prifix[i] - prifix[i - x * y];
            ans = Math.min(g, ans);
        }
        System.out.println(ans);
    }
}
