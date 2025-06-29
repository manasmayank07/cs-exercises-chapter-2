import edu.princeton.cs.algs4.StdDraw;

public class Ruler {
    public static void drawRuler(int l, double x0, double x1, double y) {
        if (l == 0) return;
        double xm = (x0 + x1) / 2.0;
        StdDraw.line(xm, y, xm, y + l * 0.1);
        drawRuler(l - 1, x0, xm, y - 0.05);
        drawRuler(l - 1, xm, x1, y - 0.05);
    }

    public static void main(String[] args) {
        StdDraw.setScale(0, 1);
        drawRuler(5, 0.0, 1.0, 0.5);
    }
}

