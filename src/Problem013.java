import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Problem013 {

    private static final String FILE_NAME = "Problem013-file.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
        BigInteger sum = BigInteger.ZERO;
        String line;
        while ((line = br.readLine()) != null) {
            sum = sum.add(new BigInteger(line));
        }
        System.out.println(sum.toString().substring(0, 10));
    }
}
