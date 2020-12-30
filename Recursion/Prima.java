import java.util.Scanner;

public class Prima {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int bil;
    Boolean prima = false;

    System.out.print("Masukkkan nilai n = ");
    bil = input.nextInt();
    input.close();

    if (bil == 2) {
      prima = true;
    } else {
      for (int i = 2; i < bil; i++) {
        if (bil % 2 == 0) {
          prima = false;
        } else {
          prima = true;
        }
      }
    }

    if (prima) {
      System.out.println("Bilangan Prima");
    } else {
      System.out.println("Bukan Bilangan prima");
    }
  }
}