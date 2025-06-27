package JAVA_DSA_Course;
public class dpsession8 {
    public static void main(String[] args) {
        int a[]= {10,20,30};
        int b[]={40,50,60};
        int c[]= {70,80,90};
        int n = a.length;
        int dpa[] = new int[n];
        int dpb[] = new int[n];
        int dpc[] = new int[n];
        dpa[0] = a[0];
        dpb[0] = b[0];
        dpc[0] = c[0];
        for (int i = 1; i < dpc.length; i++) {
            dpa[i] = a[i]+Math.max(dpb[i-1],dpc[i-1]);
            dpb[i] = b[i]+Math.max(dpa[i-1],dpc[i-1]);
            dpc[i] = c[i]+Math.max(dpa[i-1],dpb[i-1]);
        }
        System.out.println(Math.max(dpa[n-1],Math.max(dpb[n-1],dpc[n-1])));
    }
}