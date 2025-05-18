import java.util.Scanner;

public class Student {

  Scanner scanner = new Scanner(System.in);

  int age;
  String name;

  public void addDetails() {
    System.out.print("Enter The name : ");
    name = scanner.nextLine();

    System.out.print("Enter The Age : ");
    age = scanner.nextInt();
  }

  public void getDetails() {
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
  }

  public static void main(String[] args) {

    Student myObj = new Student();
    myObj.addDetails();
    myObj.getDetails();

  }
}
