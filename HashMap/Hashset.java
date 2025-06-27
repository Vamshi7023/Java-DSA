package HashMap;
import java.util.HashSet;
/**
 * Hashset
 */
public class Hashset {
    // public static void main(String[] args) {
    //     HashSet<String> st = new HashSet<>();

    //     st.add("vamshi");
    //     st.add("Krishna");
        
    //     System.out.println(st);
    //     System.out.println(st.contains("vamshi"));
    //     System.out.println(st.size());
    //     st.remove("vamshi");
    //     System.out.println(st.contains("vamshi"));
    //     System.out.println(st.size());
    //     st.add("Kamal");

    //     for(String s:st){
    //         System.out.println(s);
    //     }

    // }


    //Given an unsoreted array of integer nums return the lenght of the longest consecutive elements sequence.

    //Steps
    //Step1:Conver array to the Hashset
    //traverse to every element and find the starting point
    //update the max strak of consegutive element
    // public static int longetstsequence(int arr[]){
    //     HashSet<Integer> st = new HashSet<>();

    //     for(int num : arr) st.add(num);//adding all the elements of array in the hashset
    //     int maxstreak = 0;
    //     for(int set: st){
    //         if(!st.contains(set-1)){
    //             int start = set;
    //             int currentstreak=1;
    //             while(st.contains(start+1)){
    //                 currentstreak++;
    //                 start++;
    //             }
    //             if(currentstreak>maxstreak){
    //                 maxstreak=currentstreak;
    //             }
    //         }
    //     }
    //     return maxstreak;
    // }
    // public static void main(String[] args) {
    //     int arr[] = {100,1,4,3,200,2};
    //     System.out.println(longetstsequence(arr));
    // }

    //You are given n distinct pairs. Each pair is numbered from 1 to n. All these pairs are initially put in a bag. You need to pair up each number. You take numbers one by one from the bag and for each number you look whether the pair of this number has already been taken out of the bag, or not. If not (that means the pair of this number is still in the bag), you put the current number on the table in front of him. Otherwise, you put both numbers from the pair aside. Print the maximum number of numbers that were on the table at the same time.

    public static int TableMax(int bag[]){
        int max =0;
        HashSet<Integer> table = new HashSet<>();
        for(int i:bag){
            int num = bag[i];
            if(table.contains(num)){
                table.remove(num);
            }
            else{
                table.add(num);
                if(table.size()>max){
                    max=table.size();
                }
            }
            
            
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,1};
        System.out.println(TableMax(arr));
    }

}