package laba5;

/**
 * Created by Євгеній on 07.12.2016.
 */
public class App {
    public static void main(String[] args) {
        long num = 123456789;
        char[] chars = LongToChars.getChars(num);
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            stack.push(c);
        }
        String res = "";
        while (!stack.isEmpty()) {
            Character pop = stack.pop();
            res = res + (pop.toString());
        }
        System.out.println(res);
    }
}
