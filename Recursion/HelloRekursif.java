import java.util.Scanner;

public class HelloRekursif {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan n = ");
    int n = scan.nextInt();
    scan.close();

    rekursi(n);
  }

  public static void rekursi(int n) {
    if (1 <= n) {
      System.out.println("Hello");
      rekursi(n - 1);
    }
  }

}

// java.StackOverflowError
