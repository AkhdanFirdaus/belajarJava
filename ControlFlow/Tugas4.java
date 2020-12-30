import java.util.Scanner;

public class Tugas4 {
  public static void main(String[] args) {
    int p, q, x, y;
    Scanner scan = new Scanner(System.in);

    System.out.print("X = ");
    x = scan.nextInt();
    System.out.print("Y = ");
    y = scan.nextInt();
    
    p = x+y;

    if (p>=0) {
      q = x*y;
    } else {
      q = x/y;
    }

    System.out.println("\nQ = " + q);
    scan.close();
  }
}
