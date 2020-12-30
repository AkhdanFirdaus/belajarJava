import java.util.Scanner;
import java.util.Stack;

public class BajuBaru {
  private static Scanner scanString = new Scanner(System.in);
  private static Scanner scanInt = new Scanner(System.in);
  private static Stack<Baju> bajuBaju = new Stack<Baju>();
  // masing masing baju punya property
  // baju yang berbeda beda

  public static void main(String[] args) {
    int pilihan = 0;
    while (pilihan != 6) {
      System.out.println(
          "1. Masukkan baju\n2. Keluarkan Baju Paling Atas\n3. Keluarkan Semua Baju\n4. Lihat Baju Paling Atas\n5. Lihat Semua Baju\n6. Exit");
      System.out.print("Pilihan Menu: ");
      pilihan = scanInt.nextInt();
      switch (pilihan) {
        case 1:
          masukkanBaju();
          break;
        case 2:
          keluarkanBajuPalingAtas();
          break;
        case 3:
          keluarkanSemuaBaju();
          break;
        case 4:
          lihatBajuPalingAtas();
          break;
        case 5:
          lihatSemuaBaju();
          break;
        case 6:
          pilihan = 6;
          System.out.println("Keluar aplikasi..");
          break;
        default:
          System.out.println("Menu tidak ada");
          break;
      }
    }
  }

  private static void masukkanBaju() {
    System.out.print("Mau memasukkan berapa baju? ");
    int jml = scanInt.nextInt();

    for (int i = 0; i < jml; i++) {
      System.out.println("-----------------------------");
      System.out.println("Baju ke-" + (i + 1));
      System.out.print("Masukkan Ukuran Baju  = ");
      String ukuran = scanString.nextLine();

      System.out.print("Masukkan Merek Baju   = ");
      String merek = scanString.nextLine();

      System.out.print("Masukkan Warna Baju   = ");
      String warna = scanString.nextLine();

      // keyword new -> ngasih tau kalau ini objek baru
      bajuBaju.push(new Baju(ukuran, merek, warna));
      System.out.println("-----------------------------");
    }
  }

  private static void keluarkanBajuPalingAtas() {
    Baju bajuAtas = bajuBaju.lastElement();
    System.out.println("Baju paling atas adalah...");
    bajuAtas.tampilkanBaju();
    bajuBaju.pop();
    System.out.println("Baju dikeluarkan");
    System.out.println("Sekarang Baju Paling atas adalah");
    Baju bajuBaru = bajuBaju.lastElement();
    System.out.println("Baju paling atas adalah...");
    bajuBaru.tampilkanBaju();
  }

  public static void keluarkanSemuaBaju() {
    System.out.println("Mengeluarkan Semua Baju");
    bajuBaju.clear();
  }

  public static void lihatBajuPalingAtas() {
    if (bajuBaju.isEmpty()) {
      System.out.println("Lemari Kosong");
    } else {
      Baju baju = bajuBaju.lastElement();
      baju.tampilkanBaju();
    }
  }

  public static void lihatSemuaBaju() {
    if (bajuBaju.isEmpty()) {
      System.out.println("Lemari Kosong");
    } else {
      System.out.println("Menampilkan Semua Baju");
      for (Baju baju : bajuBaju) {
        System.out.println("--------------------------");
        baju.tampilkanBaju();
      }

    }
  }

}

class Baju {
  // property
  String ukuran;
  String merek;
  String warna;

  // Constructor => class // sesutu yang dibaca paling awal ketika pake class ini
  Baju(String ukuran, String merek, String warna) {
    this.ukuran = ukuran;
    this.merek = merek;
    this.warna = warna;
  }

  public void tampilkanBaju() {
    System.out.println("Ukuran = " + this.ukuran);
    System.out.println("Merek = " + this.merek);
    System.out.println("Warna = " + this.warna);
  }

  // overloading, override => fungsi
  // @override fungsi(int a, int b);
}
