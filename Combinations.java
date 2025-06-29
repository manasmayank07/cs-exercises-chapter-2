public class Combinations {
    public static void combine(String prefix, String s) {
        if (s.length() > 0) {
            System.out.print(prefix + " ");
            for (int i = 0; i < s.length(); i++)
                combine(prefix + s.charAt(i), s.substring(i + 1));
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String alphabet = "";
        for (int i = 0; i < n; i++)
            alphabet += (char)('a' + i);
        combine("", alphabet);
    }
}
