package laba1.task4;

public class Triangle {
    private double storona1;
    private double storona2;

    public Triangle(double storona1, double storona2) {
        this.storona1 = storona1;
        this.storona2 = storona2;
    }

    public double gipotenuza() {
        return Math.sqrt(storona1 * storona1 + storona2 * storona2);
    }
}
