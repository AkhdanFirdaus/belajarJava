import java.util.Scanner;

public class PrimaRekursif {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int bil;

    System.out.print("Masukkkan nilai n = ");
    bil = input.nextInt();
    input.close();

    if (getPrima(bil, 2)) {
      System.out.println("Bilangan Prima");
    } else {
      System.out.println("Bukan Bilangan prima");
    }
  }

  public static Boolean getPrima(int bil, int i) {
    if (bil == 2 || bil == 1) {
      return true;
    } else if (bil % i == 0) {
      return false;
    } else {
      getPrima(bil, i + 1);
      return true;
    }
  }
}
