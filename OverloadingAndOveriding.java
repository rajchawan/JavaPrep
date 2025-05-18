public class OverloadingAndOveriding {

  public static int addNums(int n1, int n2) {
    return n1 + n2;
  }

  // compile-time polymorphism

  public static int addNums(int n1, int n2, int n3) {
    return n1 + n2 + n3;
  }

  public static void main(String[] args) {
    System.out.println("1st method : " + addNums(10, 20));
    System.out.println("1st method : " + addNums(10, 20, 30));
  }
}
