import java.math.BigInteger;

public class Problem056 {

    public static void main(String[] args) {
        int maxDigitalSum = 0;
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                BigInteger number = BigInteger.valueOf(a).pow(b);
                String[] digits = number.toString().split("");
                int digitalSum = 0;
                for (String digit : digits) {
                    digitalSum += Integer.parseInt(digit);
                }
                maxDigitalSum = Math.max(digitalSum, maxDigitalSum);
            }
        }
        System.out.println(maxDigitalSum);
    }
}
