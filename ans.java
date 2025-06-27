import Opps.Student;

public class ans {
    public static void main(String[] args) {
        String a = "sbbabbb";
        if (a.contains("bab")) {
            System.out.println(true);
            return;
        }
        else if (a.contains("aba")) {
            System.out.println(true);
            return;
        }
        else{
            System.out.println(false);
        }
    }
}
