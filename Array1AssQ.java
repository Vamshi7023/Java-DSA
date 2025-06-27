class Array{
    void odd(){
        int arr[]={2,6,-5,-1,0,4,-9};

        int ans =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }

    void string(){
        String arr[]={"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        for(int i =0;i<arr.length;i++){
            if(i%2!=0){
                System.out.println(arr[i]);
            }
        }
    }

    void min(){
        int arr[]={2,6,-5,-1,0,4,-9};
        int ans =0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);

    }

    void peak(){
        int arr[]={1, 1, 3, 4, 2, 3, 5, 7, 0};

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

public class Array1AssQ {
    public static void main(String[] args) {
        Array A=new Array();
        A.odd();
        A.string();
        A.min();
        A.peak();
    }
}
