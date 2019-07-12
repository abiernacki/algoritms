package factorial;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {

        BigInteger n = new BigInteger("500");

        System.out.println(f(n));
    }

    public static BigInteger f(BigInteger n) {
        System.out.print(".");
        BigInteger val = new BigInteger("1");
        BigInteger x = new BigInteger("0");
        if (n.equals(x)) {
            return val;
        }
        BigInteger subtract = n.subtract(val);
        return n.multiply(f(subtract));
    }
}
