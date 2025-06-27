package JAVA_DSA_Course;

public class dpsession42 {
    public static void main(String[] args) {
        String s = ".aabbbaa";
        char [] c = s.toCharArray();
        int n =s.length();
        int dpa1[] = new int[n+1];
        int dpb1[] = new int[n+1];
        int dpa2[] = new int[n+1];
        int dpb2[] = new int[n+1];
        dpa1[0] =1;
        dpa2[0] =1;
        dpb1[0] =1;
        dpb2[0] =1;
        if (c[1]=='a') {
            dpa1[1] = 1;
        }
        else dpb1[1] = 1;

        // for (int i = 2; i < dpb2.length; i++) {
        //     if(c[i]=='b'){
        //         dpb1[i]=1+Math.max(dpa1[i-1], dpa2[i-1]);
        //     }
        //     if (c[i]=='b'&&c[i-1]=='b') {
        //         dpb2[i]=2+Math.max(dpa1[i-1],dpa2[i-1]);
        //     }
        //     if(c[i]=='a'){
        //         dpa1[i]=1+Math.max(dpb1[i-1], dpb2[i-1]);
        //     }
        //     if (c[i]=='a'&&c[i-1]=='a') {
        //         dpa2[i]=2+Math.max(dpb2[i-1],dpb1[i-1]);
        //     }
        // }

        if (s.charAt(0) == 'a') {
            dpa1[1] = 1;
        }
 
        if (s.charAt(0) == 'b') {
            dpb1[1] = 1;
        }
 
        long r = 0;
        int i = 1;
        long answer = 1;
        while (i <= n - 1) {
            if (s.charAt(i) == 'a') {
                dpa1[i] = 1 + Math.max(dpb1[i - 1], dpb2[i - 1]);
 
                if (i >= 2 && s.charAt(i - 1) == 'a') {
                    dpa2[i] = 2 + Math.max(dpb1[i - 2], dpb2[i - 2]);
                } else if (s.charAt(i - 1) == 'a') {
                    dpa2[i] = 2;
                }
                dpb1[i] = 0;
                dpb2[i] = 0;
            } else {
 
                dpb1[i] = 1 + Math.max(dpa1[i - 1], dpa2[i - 1]);
 
                if (i >= 2 && s.charAt(i - 1) == 'b') {
                    dpb2[i] = 2 + Math.max(dpa1[i - 2], dpa2[i - 2]);
                } else if (s.charAt(i - 1) == 'b') {
                    dpb2[i] = 2;
                }
                dpa1[i] = 0;
                dpa2[i] = 0;
            }
 
            // System.out.println(dpa1[i] + " " + dpa2[i] + " " + dpb1[i] + " " + dpb2[i]);

        //at the end take the max of all the states dpa1[n] ,dpa2[n],dpb1[n],dpb2[n]
    }
}
}