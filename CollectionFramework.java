import java.util.ArrayList;
import java.util.HashSet;

public class CollectionFramework {

  public void traverseArrayList(ArrayList<String> arr) {
    for (String i : arr) {
      System.out.println(i);
    }
  }

  public void storeUniq() {
    HashSet<String> cars = new HashSet<>();
    cars.add("BMW");
    cars.add("AUDI");
    cars.add("BMW");

    // Stores only unique items
    for (String i : cars) {
      System.out.println(i);
    }
  }

  public void storeUniq() {
    HashSet<String> cars = new HashSet<>();
    cars.add("BMW");
    cars.add("AUDI");
    cars.add("BMW");

    // Stores only unique items
    for (String i : cars) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<>();

    cars.add("CRETA");
    cars.add("FORTUNER");
    cars.add("SWIFT");
    // System.out.println(cars.get(0));

    CollectionFramework myObj = new CollectionFramework();

    // myObj.traverseArrayList(cars);

    myObj.storeUniq();

  }

}
