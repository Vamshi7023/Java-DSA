package JAVA_DSA_Course;
public class dpsession14 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 100 };
        int b[] = { 1, 2, 3, 4, 100 };
        int dpa[] = new int[a.length + 1];
        int dpb[] = new int[b.length + 1];
        
        dpa[0] = a[0];
        dpb[0] = b[0];
        if (a.length > 1) {
            dpa[1] = dpa[1 - 1] + a[1];
            dpb[1] = dpb[1 - 1] + b[1];
        }
        for (int i = 2; i < a.length; i++) {
            dpa[i] = Math.max(dpa[i - 1] + a[i], dpb[i - 2] + a[i]);
            dpb[i] = Math.max(dpb[i - 1] + b[i], dpa[i - 2] + b[i]);
        }
        System.out.println(dpa[a.length-1] + " " + dpb[b.length-1]);
    }
}