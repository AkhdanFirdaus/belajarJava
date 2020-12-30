package Animals;

public class Horse extends Animal {
  @Override
  public void sound() {
    System.out.println("Meringkik");
  }

  public static void main(String args[]) {
    Animal obj = new Horse();
    obj.sound();
  }
}
