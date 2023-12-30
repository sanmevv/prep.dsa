public class removalA {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "baccad";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a') {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }

}