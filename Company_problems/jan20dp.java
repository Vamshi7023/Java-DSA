public class jan20dp {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3,4,5};
        int c[] = {1,2,3,4,5};
        int n = a.length;
        int dpa[] = new int[n+1];
        int dpb[] = new int[n+1];
        int dpc[] = new int[n+1];

        // for (int i = 1; i <= n; i++) {
        //     dpa[i] = a[i-1]+Math.max(dpb[i-1],dpc[i-1]);
        //     dpb[i] = b[i-1]+Math.max(dpa[i-1],dpc[i-1]);
        //     dpc[i] = c[i-1]+Math.max(dpb[i-1],dpa[i-1]);
        // }

        // System.out.println(Math.max(dpa[n],Math.max(dpb[n],dpc[n])));

        dpa[0] = a[0];
        dpb[0] = b[0];
        dpc[0] = c[0];
 
        if (n > 1) {
            dpa[1] = a[1] + Math.max(a[0], Math.max(b[0], c[0]));
            dpb[1] = b[1] + Math.max(a[0], Math.max(b[0], c[0]));
            dpc[1] = c[1] + Math.max(a[0], Math.max(b[0], c[0]));
        }
 
        for (int i = 2; i < n; i++) {
            dpa[i] = Math.max(
                a[i] + Math.max(dpb[i - 1], dpc[i - 1]),
                a[i] + a[i - 1] + Math.max(dpb[i - 2], dpc[i - 2])
            );
            dpb[i] = Math.max(
                b[i] + Math.max(dpa[i - 1], dpc[i - 1]),
                b[i] + b[i - 1] + Math.max(dpa[i - 2], dpc[i - 2])
            );
            dpc[i] = Math.max(
                c[i] + Math.max(dpa[i - 1], dpb[i - 1]),
                c[i] + c[i - 1] + Math.max(dpa[i - 2], dpb[i - 2])
            );
        }
 
        int result = Math.max(dpa[n - 1], Math.max(dpb[n - 1], dpc[n - 1]));
        System.out.println(result);
    }
}
