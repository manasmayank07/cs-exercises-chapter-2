import edu.princeton.cs.algs4.StdDraw;

public class A4Paper {
    public static void draw(int n, double x, double y, double w, double h, boolean vertical) {
        if (n == 0) return;
        StdDraw.rectangle(x + w / 2, y - h / 2, w / 2, h / 2);
        if (vertical) {
            draw(n - 1, x, y, w / 2, h, false);
            draw(n - 1, x + w / 2, y, w / 2, h, false);
        } else {
            draw(n - 1, x, y, w, h / 2, true);
            draw(n - 1, x, y - h / 2, w, h / 2, true);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, 1);
        draw(n, 0, 1, Math.sqrt(2), 1, true);
    }
}


