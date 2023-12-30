import java.util.*;

public class RepIdx {
    public static void main(String[] args) {

        String ip = "abcdcaf";

        for (int i = 0; i < ip.length(); i++) {
            Character c = ip.charAt(i);
            if (ip.indexOf(c) == ip.lastIndexOf(c)) {
                System.out.println(ip.indexOf(c));
                break;
            }

        }
    }

}
