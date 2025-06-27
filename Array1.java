class arrya {
    void Array() {
        int arr[] = new int[3];
        float weight[] = new float[3];
        String names[] = new String[3];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        weight[0] = 23;
        weight[1] = 23;
        weight[2] = 23;

        names[0] = "Vamshi";
        names[1] = "Vamshi";
        names[2] = "Vamshi";

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int j = 0; j < weight.length; j++) {
            System.out.println(weight[j]);
        }
        for (int k = 0; k < names.length; k++) {
            System.out.println(names[k]);
        }
    }

    void multidimentionalArray() {
        // int arr1 [][] = new int[3][2];
        int arr1[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        System.out.println(arr1[0][0]);
        System.out.println(arr1[0][1]);

        System.out.println(arr1[1][0]);
        System.out.println(arr1[1][1]);

        System.out.println(arr1[2][0]);
        System.out.println(arr1[2][1]);

        System.out.println("using loop");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(arr1[i][j]);
            }
        }
    }

    void sum() {
        // sum of all element in the array
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 3;

        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(sum=sum+arr[i]);
        }
    }

    void max(){
        //finding the max value
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 3;

        int ans =0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]>ans) {
            ans=arr[i];
           }
        }
        System.out.println("max value is"+ans);
    }

    void find(){
        //find an ele in arr
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 3;

        int f=3;

        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==f){
               ans=i;
               break;
            }
            
        }
        System.out.println("The index value is at index "+ans);
        
    }
}

public class Array1 {
    public static void main(String[] args) {
        arrya A = new arrya();
        // A.Array();
        // A.multidimentionalArray();
        // A.sum();
        // A.max();
        A.find();
    }

}
