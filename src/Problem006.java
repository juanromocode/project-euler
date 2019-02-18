public class Problem006 {

  public static void main(String[] args) {
    int sumOfSquares = 0;
    int squareOfSum = 0;
    for (int i = 1; i <= 100; i++) {
      sumOfSquares += Math.pow(i, 2);
      squareOfSum += i;
    }
    squareOfSum *= squareOfSum;
    System.out.println(squareOfSum - sumOfSquares);
  }
}