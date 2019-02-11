import java.math.BigInteger;

public class Problem048 {

    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 1_000; i++) {
            sum = sum.add(BigInteger.valueOf(i).pow(i));
        }
        System.out.println(sum.toString().substring(sum.toString().length() - 10));
    }
}
