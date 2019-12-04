package ds.stack;

public class App {

    public static void main(String[] args) {
        Stack theStack = new Stack(4);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while (!theStack.isEmpty()) {
            long value = theStack.pop(); //мы можем взять значение из стека
            System.out.println(value);
        }

    }

    public static String reverseString(String str) {
        return str;
    }
}
