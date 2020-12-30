import java.util.Scanner;

public class SumRekursif {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Data: ");
    int n = scan.nextInt();
    scan.close();

    System.out.println("Jumlah hasil tambah = " + sum(n));
  }

  public static int sum(int n) {
    if (n == 0) {
      return 0;
    } else {
      return n + sum(n - 1);
    }
  }
}