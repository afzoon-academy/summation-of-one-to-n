// summation of 1 to N
// time complexity of this algorithms is O(n)
/*import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int sumOfOneToN = 0;

    for (int i = 0; i <= n; i++) {
      sumOfOneToN += i;
    }

    System.out.println(
      "The summation of 1 to " + n + " is " + sumOfOneToN
    );
  }
}*/

// summation of 1 to N
// time complexity of this algorithms is O(1)
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int sumOfOneToN = n * (n + 1) / 2;

    System.out.println(
      "The summation of 1 to " + n + " is " + sumOfOneToN
    );
  }
}