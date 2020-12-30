import java.util.Scanner;

public class CastingVariable {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int var_alas;
    int var_tinggi;
    double rumus_luas;

    System.out.print("Masukkan Alas Segitiga: ");
    var_alas = scan.nextInt();
    System.out.print("Masukkan Luas Segitiga: ");
    var_tinggi = scan.nextInt();

    rumus_luas = (var_alas * var_tinggi) / 2;
    System.out.println("Luas Segitiga: " + rumus_luas);

    scan.close();
  }
}
