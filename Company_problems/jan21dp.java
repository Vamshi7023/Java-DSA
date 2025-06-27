public class jan21dp {
    public static void main(String[] args) {
        int a[] = {2,3,6,8,9,10};
        int b[] = {1,5,9,30,2,21};

        int n = a.length;
        int dpa_even[] = new int[a.length];
        int dpa_odd[] = new int[a.length];
        int dpb_even[] = new int[b.length];
        int dpb_odd[]= new int[b.length];

        if (a[0]%2==0) {
            dpa_even[0]=1;
        }
        else{
            dpa_odd[0]=1;
        }

        if (b[0]%2==0) {
            dpb_even[0]=1;
        }
        else{
            dpb_odd[0]=1;
        }
        for (int i = 1; i < n; i++) {
            if (a[i]%2==0) {
                dpa_even[i]=dpa_even[i-1]+dpb_even[i-1];
                dpa_odd[i] = dpa_odd[i - 1] + dpb_odd[i - 1];
            }
            else{
                dpa_even[i]=dpa_odd[i-1]+dpb_odd[i-1];
                dpa_odd[i]=dpa_even[i-1]+dpb_even[i-1];
            }
            if (b[i]%2 == 0) {
                dpb_even[i]= dpb_even[i-1]+dpa_even[i-1];
                dpb_odd[i] = dpb_odd[i-1]+dpa_odd[i-1];
            }
            else{
                dpb_even[i]=dpa_odd[i-1]+dpb_odd[i-1];
                dpb_odd[i]=dpa_even[i-1]+dpb_even[i-1];
            }
        }
        System.out.println(dpa_even[n-1]+dpb_even[n-1]);
        System.out.println(dpa_odd[n-1]+dpb_odd[n-1]);
    }
}