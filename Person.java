public class Person {

  private String name;
  private int age;

  public void getDetails() {
    System.out.println(name);
    System.out.println(age);
  }

  public void setDetails(String newName, int newAge) {
    this.name = newName;
    this.age = newAge;
  }
}
