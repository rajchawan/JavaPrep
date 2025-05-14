import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number you want to check:");
    int checkNum = scanner.nextInt();

    factorial(checkNum);
    pailnDrome(checkNum);
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
}
