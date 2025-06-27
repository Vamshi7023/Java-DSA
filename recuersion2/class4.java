package recuersion2;

public class class4 {
    public static void swap(int l,int r,int arr[]){
        if(l>=r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        swap(l+1, r-1, arr);
    }
    public static boolean palindrome(int l,int r,String a){
        if (l>=r) {
            return true;
        }
        if (a.charAt(l)==a.charAt(r)) {
            return palindrome(l+1, r-1, a);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int l = 0;
        int r = arr.length-1;
        swap(l, r, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        String s = "madam";
        int l1 = 0;
        int r1 = s.length()-1;
        boolean c = palindrome(l1, r1, s);
        System.out.println(c);
    }
}
