package schreibtischtest;

public class Test {
    static int i = 10;

    public static void doStuff(int a) {
        a = 20;
    }

    public static void main(String[] args) {
        doStuff(i);
        System.out.println(i);
    }
}
