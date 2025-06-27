
public class micro10jan {
    //non interceting ranges
    public static boolean check(int i,int j,int a[][]){
        int l1 = a[i][0];
        int r1 = a[i][1];
        int l2 = a[j][0];
        int r2 = a[j][1];
        if (l2>r1||r2<l1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n =3;
        int a[][] = {{1, 3}, {5, 7}, {8, 10}};
        int count =0;
        boolean intersec = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                intersec = check(i,j,a);
            }
            if (intersec) {
                count++;
            }
        }
        System.out.println(count);
    }
}
