import java.util.Scanner;

public class Car extends Vehicle {
  String modelType;

  Scanner scanner = new Scanner(System.in);

  public void addDetails(Car car) {
    System.out.print("Enter the color : ");
    car.color = scanner.nextLine();

    System.out.print("Enter the horse power : ");
    car.horsePower = scanner.nextLine();

    System.out.print("Enter the Manufacturer : ");
    car.manufacturer = scanner.nextLine();

    System.out.print("Enter the Model Type : ");
    car.modelType = scanner.nextLine();

    System.out.print("Enter the Tank Capicty : ");
    car.tankCapacity = scanner.nextInt();
  }

  public void getCarDetails(Car car) {
    System.out.println("Color : " + car.color);
    System.out.println("Horse Power : " + car.horsePower);
    System.out.println("Manufacturer : " + car.manufacturer);
    System.out.println("Tank Capacity : " + car.tankCapacity);
    System.out.println("Model Type : " + car.modelType);
  }

  // compile-time polymorphism

  public static void greet() {
    System.out.println("Greetings from Derived Class");
  }

  public static void main(String[] args) {

    Car myCar = new Car();

    myCar.addDetails(myCar);
    myCar.getCarDetails(myCar);
    myCar.greet();
  }
}