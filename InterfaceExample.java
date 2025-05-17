interface Animal {

  public void sound();

  public void exampleSound();

}

public class InterfaceExample implements Animal {

  public void sound() {
    System.out.println("POmmm Pomm");
  }

  public void exampleSound() {
    System.out.println("ZuuuzUZUZUZUZUUZUZ");
  }

  public static void main(String[] args) {
    InterfaceExample myClassObj = new InterfaceExample();

    myClassObj.sound();
    myClassObj.exampleSound();
  }

}
