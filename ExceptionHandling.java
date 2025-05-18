public class ExceptionHandling {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    try {
      System.out.println(arr[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index is out of bound for length 4");
      // System.out.println(e.getMessage());
    } finally {
      System.out.println("Finally Block will execute even if exception occurs or not");
    }
  }
}
