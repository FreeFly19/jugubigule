package laba4;

/**
 * Created by Євгеній on 07.12.2016.
 */
public class App {
    public static void main(String[] args) {
        Pair pair = new Pair(1, 55);
        Pair pair2 = new Pair(5, 10);
        int compare = pair.compareTo(pair2);
        switch (compare) {
            case 0: {
                System.out.println("Second pair larger then first pair");
                break;
            }
            case 1: {
                System.out.println("First pair larger then second pair");
                break;
            }
        }
        System.out.println();
        Fraction fraction = new Fraction(10, 5.5);
        Fraction fraction2 = new Fraction(10, 5);
        int fractionCompare = fraction.compareTo(fraction2);
        switch (fractionCompare){
            case 1:{
                System.out.println("In first pair first parameter larger then first parameter in second pair");
                break;
            }
            case 2:{
                System.out.println("In second pair first parameter larger then first parameter in first pair");
                break;
            }
            case 3:{
                System.out.println("In first pair second parameter larger then second parameter in second pair");
                break;
            }
            case 4:{
                System.out.println("In second pair second parameter larger then second parameter in first pair");
                break;
            }
            case 5:{
                System.out.println("In first pair first parameter is first parameter in second pair");
                break;
            }
            case 6:{
                System.out.println("In first pair second parameter is second parameter in second pair");
                break;
            }
        }
        System.out.println("\n"+fraction.partition());
    }
}
