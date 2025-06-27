package JAVA_DSA_Course;

public class HashingSession35 {
    public static void main(String[] args) {
        
        //Brute force approach O(n^3)

        // int a[] = {8,1,2,3,4,5};
        // int count =0;
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = i+1; j < a.length; j++) {
        //         for (int j2 = j+1; j2 < a.length; j2++) {
        //             if (a[i]>a[j] && a[j]<a[j2]) {
        //                 count++;
        //             }
        //         }
        //     }
        // }
        // System.out.println(count);


        int a[] = {8,1,2,3,4,5};
        int n = a.length;
        
        int prefix[] = new int[n+1];
        prefix[1]=0;
        int j=2;
        while(j<=n) {
            int count =0;
            int i=1;
            while (i<=j-1) {
                if (a[i-1]>a[j-1]) {
                    count++;
                }
                i++;
            }
            prefix[j] = count;
            j++;
        }
        int[] suf = new int[n + 1]; // suf array (1-based indexing)
        // Outer loop: iterate from n-1 to 1
        for (int l = n - 1; l >= 1; l--) {
            int c = 0; // Initialize counter for each j

            // Inner loop: iterate from j+1 to n
            for (int k = l + 1; k <= n; k++) {
                if (a[l-1] < a[k-1]) {
                    c++; // Increment counter if condition is true
                }
            }

            // Store the counter in suf[j]
            suf[l] = c;
        }

        int c = 0;
        j = 1;
        while (j <= n) {
            c = c + prefix[j] * suf[j];
            j++;
        }
 
        System.out.println(c);
    }
}
