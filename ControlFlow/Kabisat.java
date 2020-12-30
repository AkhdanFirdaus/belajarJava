import java.util.Scanner;

public class Kabisat {
  static Boolean cekKabisat(int tahun) {
    return tahun % 4 == 0;
  }

  public static void main(String[] args) {
    int tahun;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan tahun = ");
    tahun = scan.nextInt();

    System.out.println(tahun + (cekKabisat(tahun) ? " adalah " : " bukan ") + "tahun kabisat");

    scan.close();
  }
}