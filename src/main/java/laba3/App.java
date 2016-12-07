package laba3;

public class App {
    public static void main(String[] args) {
        Vector3D vector3D1 = new Vector3D(54, 87, 6);
        Vector3D vector3D2 = new Vector3D(234, 567, 67);

        Vector3D vector3D3 = new Vector3D(54, 87, 6);
        Vector3D vector3D4 = new Vector3D(234, 567, 67);

        Vector3D vector3D5 = new Vector3D(54, 87, 6);

        Vector3D vector3D6 = new Vector3D(54, 87, 6);
        Vector3D vector3D7 = new Vector3D(54, 87, 6);

        Vector3D addition = vector3D1.addition(vector3D2);
        Vector3D subtraction = vector3D4.subtraction(vector3D3);
        Vector3D multiply = vector3D5.scalarMultiply(10);

        System.out.println("Addition vectors: ");
        System.out.println(addition.toString());
        System.out.println("Subtraction vectors: ");
        System.out.println(subtraction.toString());
        System.out.println("Multiply vectors: ");
        System.out.println(multiply.toString());
        System.out.println("Scalar Product of Vectors: " + vector3D1.scalarProduct(vector3D2));
        System.out.println("Vertor length: " + vector3D2.vectorLength());

        if (vector3D6.compareVectorLength(vector3D7)) {
            System.out.println("Vectors identical");
        } else {
            System.out.println("Vectors is not identical");
        }
    }
}
