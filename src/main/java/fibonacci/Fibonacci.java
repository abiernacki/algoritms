package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 19;

        System.out.println(f(n));
    }


    public static int f(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }
}
