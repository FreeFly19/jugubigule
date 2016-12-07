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
        double doublePartitionA = a;
        int intPartitionA = (int) doublePartitionA;

        double doublePartitionB = b;
        int intPartitionB = (int) doublePartitionB;

        double v = doublePartitionA - intPartitionA;
        double v1 = doublePartitionB - intPartitionB;
        return ("Partitioned first number: \n" + "integer: " + intPartitionA+"\t" + "fractional : " + v +
                "\nPartitioned second number: \n" + "integer: " + intPartitionB+"\t" + "fractional : " + v1);
    }
}
