import java.util.Scanner;
import java.lang.Math;

public class Persamaan {
  public static void main(String[] args) {
    double a, b, c, d;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan nilai A = ");
    a = scan.nextInt();
    System.out.print("Masukkan nilai B = ");
    b = scan.nextInt();
    System.out.print("Masukkan nilai C = ");
    c = scan.nextInt();
    scan.close();

    d = persamaan(a, b, c);

    if (d < 0) {
      System.out.print(Math.sqrt(-d) + " adalah akar imajiner");
    } else if (d > 0) {
      double x1 = rumusAkar(a, b, d);
      double x2 = rumusAkar(a, b, d);
      System.out.println("X1 = " + x1);
      System.out.println("X2 = " + x2);
    } else {
      d = rumusSama(a, b);
      System.out.println(d + " dimana X1 = X2");
    }
  }

  private static double persamaan(double a, double b, double c) {
    return Math.pow(b, 2) - 4 * a * c;
  }

  private static double rumusAkar(double a, double b, double d) {
    return -b + Math.sqrt(d / (2 * a));
  }

  private static double rumusSama(double a, double b) {
    return -b / (2 * a);
  }
}
