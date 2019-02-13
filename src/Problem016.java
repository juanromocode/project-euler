import java.math.BigInteger;

public class Problem016 {

    public static void main(String[] args) {
        BigInteger number = BigInteger.TWO.pow(1_000);
        int sum = 0;
        for (String digit : number.toString().split("")) {
            sum += Integer.parseInt(digit);
        }
        System.out.println(sum);
    }
}