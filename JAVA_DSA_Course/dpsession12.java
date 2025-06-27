package JAVA_DSA_Course;

public class dpsession12 {
    public static void main(String[] args) {
        int arr[] = {12,34,12,-100,34,2,10};
        int n = arr.length;
        int dpf[][] = new int[n][n];
        int dpb[][] = new int[n][n];
        dpf[0][2] = arr[0] ;
        dpf[1][2] = arr[1];
        dpb[0][1] = arr[0];

        for (int i = 2; i < dpf.length; i++) {
            dpf[i][2] = arr[i]+Math.min(dpf[i-2][2],dpb[i-1][1]);//2-step forward jump
            dpb[i][1] = arr[i]+dpb[i-1][2]+arr[i]+arr[i+1];//1 step backward jump
        }
        //Not the correct code but simmilar algorithm see doc for correct code
    }
}