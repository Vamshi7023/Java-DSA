package JAVA_DSA_Course;

public class TwopointersSliddingSession10 {
    public static void main(String[] args) {
        String a = "absgzet";
        String b = "cafea";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i)==b.charAt(j)) {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
}
