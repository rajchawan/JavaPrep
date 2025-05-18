import java.util.Scanner;

public class Bike extends Vehicle {
  String modelType;

  Scanner scanner = new Scanner(System.in);

  public void addDetails(Bike bike) {
    System.out.print("Enter the color : ");
    bike.color = scanner.nextLine();

    System.out.print("Enter the horse power : ");
    bike.horsePower = scanner.nextLine();

    System.out.print("Enter the Manufacturer : ");
    bike.manufacturer = scanner.nextLine();

    System.out.print("Enter the Model Type : ");
    bike.modelType = scanner.nextLine();

    System.out.print("Enter the Tank Capicty : ");
    bike.tankCapacity = scanner.nextInt();
  }

  public void getbikeDetails(Bike bike) {
    System.out.println("Color : " + bike.color);
    System.out.println("Horse Power : " + bike.horsePower);
    System.out.println("Manufacturer : " + bike.manufacturer);
    System.out.println("Tank Capacity : " + bike.tankCapacity);
    System.out.println("Model Type : " + bike.modelType);
  }

  public static void main(String[] args) {

    Bike mybike = new Bike();

    mybike.addDetails(mybike);
    mybike.getbikeDetails(mybike);
  }
}