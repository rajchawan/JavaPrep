abstract class Animal {

  public abstract void sound();

  public void sleepSound() {
    System.out.println("Zzzzzz");
  }

}

public class AbstractDog extends Animal {

  public void sound() {
    System.out.println("BONKK BONKK");
  }

  public static void main(String[] args) {

    AbstractDog myObj = new AbstractDog();

    myObj.sound();
    myObj.sleepSound();
  }

}
