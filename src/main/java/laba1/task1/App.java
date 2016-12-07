package laba1.task1;

public class App {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle();

        triangle.storona1 = 5;
        triangle.storona2 = 10;

        triangle1.storona1 = 58;
        triangle1.storona2 = 44;

        System.out.println("First Triangle object vars: \nStorona1: " + triangle.storona1 +
                "\nStorona2: " + triangle.storona2);
        System.out.println("Second Triangle object vars: \nStorona1: " + triangle1.storona1 +
                "\nStorona2: " + triangle1.storona2);
    }
}
