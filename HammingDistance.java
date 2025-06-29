public class HammingDistance {
    public static void generate(String s, int k, int pos) {
        if (k == 0) {
            System.out.println(s);
            return;
        }
        for (int i = pos; i < s.length(); i++) {
            char[] chars = s.toCharArray();
            chars[i] = (chars[i] == '0') ? '1' : '0';
            generate(new String(chars), k - 1, i + 1);
        }
    }

    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        String s = args[1];
        generate(s, k, 0);
    }
}
