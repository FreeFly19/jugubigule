package laba4;

public class Pair {
    protected double a = 0;
    protected double b = 0;

    public Pair(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public int compareTo(Pair pair) {
        if (a > pair.a || a == pair.a && b > pair.b) return 1;
        return 0;
    }
}
