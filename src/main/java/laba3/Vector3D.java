package laba3;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D addition(Vector3D vector) {
        x = x + vector.x;
        y = y + vector.y;
        z = z + vector.z;
        return Vector3D.this;
    }

    public Vector3D subtraction(Vector3D vector) {
        x = x - vector.x;
        y = y - vector.y;
        z = z - vector.z;
        return Vector3D.this;
    }

    public double scalarProduct(Vector3D vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector3D scalarMultiply(double v) {
        x = x * v;
        y = y * v;
        z = z * v;
        return Vector3D.this;
    }

    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public boolean compareVectorLength(Vector3D vector) {
        if (vectorLength() == vector.vectorLength()) return true;
        return false;
    }

    @Override
    public String toString() {
        return "X: " + this.x +
                "\nY: " + this.y +
                "\nZ: " + this.z;
    }
}
