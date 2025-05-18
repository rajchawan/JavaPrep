import java.util.ArrayList;

public class StringHandling {

  public static void main(String[] args) {
    // String str = "eeeee";
    // vowelsCheck(str);
    // removeDuplicateChar("ssttrr");
    // convertStrToInt("123.54");
    reverseSentance("I LOVE KAMOTHE");
  }

  public static void reverseSentance(String str) {

    StringBuilder revSent = new StringBuilder();

    for (int i = str.length() - 1; i >= 0; i--) {
      revSent.append(str.charAt(i));
    }
    System.out.println(revSent);
  }

  public static void convertStrToInt(String str) {
    try {
      int num = Integer.parseInt(str);
      System.out.println(num);
    } catch (NumberFormatException e) {
      System.out.println("Input Error " + e.getMessage());
    }
  }

  public static void removeDuplicateChar(String str) {

    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j < str.length(); j++) {
        if (str.charAt(i) == str.charAt(j)) {
          System.out.print(str.charAt(j));
        }
      }
    }
  }

  public static void vowelsCheck(String str) {
    int count = 0, consonants = 0,;

    for (int i = 0; i < str.length(); i++) {
      char currChar = Character.toLowerCase(str.charAt(i));

      if (currChar == 'a' || currChar == 'e' || currChar == 'i' || currChar == 'o' || currChar == 'u') {
        count++;
      } else {
        consonants++;
      } 
    }

    System.out.println("Vowels Count : " + count);
  }
}
