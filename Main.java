import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // System.out.print("Enter the number you want to check:");
    // int checkNum = scanner.nextInt();

    // factorial(checkNum);
    // pailnDrome(checkNum);
    // pascal(5);
    fibonaccci(5);
  }

  public static void factorial(int num) {
    double result = 1;
    if (num > 0) {
      for (int i = num; i > 1; i--) {
        result = result * i;
      }
      System.out.println("Factorial of " + num + " is : " + result);
    } else {
      System.out.println("Number should be Greater than 0");
    }
  }

  public static void pailnDrome(int num) {
    int originalNum = num;

    int revNum = 0;

    while (num != 0) {
      int digit = num % 10;
      revNum = revNum * 10 + digit;
      num = num / 10;
    }

    if (originalNum == revNum) {
      System.out.println("The Number is Pailndrom");
    } else {
      System.out.println("Not Pailndrome");
    }
  }

  public static void pascal(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }

  public static void fibonaccci(int n) {

    int sum = 0;
    int prev = 0;

    for (int i = 0; i <= n; i++) {

      sum = i + prev;
      System.out.print(sum + " ");
      prev = i;
      ;

    }
  }
}
