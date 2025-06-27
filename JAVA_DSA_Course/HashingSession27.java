package JAVA_DSA_Course;

import java.util.Scanner;

public class HashingSession27 {
    public static int hours(String hrs){
        String parts[] = hrs.split(":");
        int hours = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);
        int totalmin = (hours*60)+min;
        return totalmin;
    }

    public static void ck(int num){
        int u = num/60;//min to hr
        int m = num%60;//min after removinh hrs
        if (u<=9) {
            System.out.print("0");
            System.out.println(u);
        }
        else System.out.print(u);
        System.out.print(":");
        if (m<=9) {
            System.out.print("0");
            System.out.println(m);
        }
        else System.out.print(m);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[1440];
        for (int i = 0; i < n; i++) {
            System.out.println("enter time in HH:MM : ");
            String a = s.next();
            String b = s.next();
            int l=hours(a);
            int m =hours(b);
            arr[l]=1;
            arr[m+1]=-1;
        }
        String t1 = "01:20";
        String t2 = "02:20";
        
        
        for (int i = 1; i < arr.length; i++) {
            arr[i]+=arr[i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        int c = 0;
        int g = 0;
 
        for (int j = 0; j < 1440; j++) {
            if (arr[j] == 0) {
                c++;
 
                if (c == k) {
                    ck(j - k + 1); // convert this to (hh:mm)
                    g = 1;
                    break;
                }
            } else {
                c = 0;
            }
        }
 
        if (g == 0) {
            System.out.println("-1");
        }

    }
}
