package JAVA_DSA_Course;

public class HashingSession37 {
    private static int matching(String a, String b) {
        int matchCount = 0;
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                matchCount++;
            } else {
                break;
            }
        }
        return matchCount;
    }
    public static void main(String[] args) {
        String a[] = {"abc","abc"};
        int n = a.length;
        int [] finalmatch  = new int[n+1];
        int ans = 0;
        for (int i= n-1; i>=0; i--) {
            if (i != n - 1) {
                for (int j = i + 1; j < n; j++) {
                    int count = matching(a[i], a[j]);
                    ans += count;
                }
            }
            finalmatch[i] = ans;
        }
        for (int i = 0; i <= finalmatch.length; i++) {
            System.out.println(finalmatch[i]);
        }
    }
}
