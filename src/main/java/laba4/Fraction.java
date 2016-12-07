package laba4;

public class Fraction extends Pair {

    public Fraction(double a, double b) {
        super(a, b);
    }

    public int compareTo(Fraction fraction) {
        if (a > fraction.a) return 1;
        if (a < fraction.a) return 2;
        if (b > fraction.b) return 3;
        if (b < fraction.b) return 4;
        if (a == fraction.a) return 5;
        if (b == fraction.b) return 6;
        return 0;
    }

    public String partition() {
        double partitionPartA = a;
        int wholePartA = (int) partitionPartA;

        double partitionPartB = b;
        int wholePartB = (int) partitionPartB;

        double res1 = partitionPartA - wholePartA;
        double res2 = partitionPartB - wholePartB;
        return ("Partitioned first number: \n" + "integer: " + wholePartA + "\t" + "fractional : " + res1 +
                "\nPartitioned second number: \n" + "integer: " + wholePartB + "\t" + "fractional : " + res2);
    }
}
