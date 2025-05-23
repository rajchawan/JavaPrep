import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // System.out.print("Enter the number you want to check:");
    // int checkNum = scanner.nextInt();

    // factorial(checkNum);
    // pailnDrome(checkNum);
    // pascal(5);
    // fibonaccci(10);
    // reverseString("VIRAJ");
    // swapNumbers(1, 2);
    // checkVowel("RAJ");
    // List<Integer> numList = new ArrayList<>(List.of(2, 3, 5));
    // System.out.println(checkOddNumsInList(numList));

    // Person myObj = new Person();
    // myObj.setDetails("Raj", 24);
    // myObj.getDetails();
    // armStrongNumber(153);
    anagramString("listtten", "silenttt");
  }

  public static void anagramString(String str1, String str2) {
    char charArray1[] = str1.toCharArray();
    char charArray2[] = str2.toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    if (Arrays.equals(charArray1, charArray2)) {
      System.out.println("Both the strings are Anagram Strings");
    } else {
      System.out.println("Strings are not anagrams");
    }
  }

  public static void armStrongNumber(int num) {
    String str = String.valueOf(num);
    int sum = 0;
    int ogNum = num;

    while (num != 0) {
      int a = num % 10;
      sum += Math.pow(a, str.length());
      num = num / 10;
    }
    if (ogNum == sum) {
      System.out.println(sum + " Is an Arstrong Number");
    } else {
      System.out.println(ogNum + " Is not an Armstrong Number");
    }
  }

  public static boolean checkOddNumsInList(List<Integer> list) {
    for (int i : list) {
      if (i % 2 == 0) {
        return false;
      }
    }
    return true;
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

  public static void fibonaccci(int count) {

    int a = 0;
    int b = 1;
    int c = 1;

    for (int i = 0; i <= count - 1; i++) {

      if (i == count - 1) {
        System.out.print(a + ".");
      } else {
        System.out.print(a + ", ");
      }
      a = b;
      b = c;
      c = a + b;
    }
  }

  public static void reverseString(String str) {
    String revStr = "";
    if (str != null) {
      for (int i = str.length() - 1; i >= 0; i--) {
        revStr = revStr + str.charAt(i);
      }
      System.out.println(revStr);
    } else {
      System.out.println("Null is not valid input");
    }
  }

  public static void swapNumbers(int n1, int n2) {
    System.out.print("Before Swap N1 = " + n1 + ", N2=" + n2);
    n2 = n2 + n1;
    n1 = n2 - n1;
    n2 = n2 - n1;
    System.out.print(" & After Swap N1 = " + n1 + ", N2=" + n2);
  }

  public static void checkVowel(String str) {
    String regex = ".*[aeiou].";
    System.out.println("Vowel Present :" + str.toLowerCase().matches(regex));
  }
}
