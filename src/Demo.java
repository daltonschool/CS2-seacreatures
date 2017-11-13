import java.util.Arrays;

public class Demo {
    static int age = 3;


    public static void main(String[] args) {
        Hello();
        System.out.println("your age is " + age);
        add(4, 5);
        add(6, 7);


        int diff = subtract(6, 4);
        System.out.println(diff);

        String fname = firstname("Charles Forster Stewert");

        String[] board = new String[40];
        Arrays.fill(board, "GRAY");
        board = setRandom(board, "RED");

    }

    static String[] setRandom(String[] foo, String color) {
        return foo;

    }

    static void Hello() {
        System.out.println("hello");
        System.out.println("world");
        System.out.println("your age is " + age);
    }

    static void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    static int subtract(int num1, int num2) {
        int difference = num1 - num2;
        return difference;
    }

    static String firstname(String wholename) {
        return wholename.split(" ")[0];
    }



}
