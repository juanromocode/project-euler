public class Problem004 {

  public static void main(String[] args) {
    int largestProduct = -1;
    for (int i = 100; i < 1_000; i++) {
      for (int j = 100; j < 1_000; j++) {
        int product = i * j;
        if (isPalindrome(product)) {
          largestProduct = Math.max(product, largestProduct);
        }
      }
    }
    System.out.println(largestProduct);
  }

  public static boolean isPalindrome(int num) {
    String numStr = Integer.toString(num);
    String numStrRev = new StringBuilder(numStr).reverse().toString();
    return numStr.equals(numStrRev);
  }
}