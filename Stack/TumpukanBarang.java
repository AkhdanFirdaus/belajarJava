import java.util.Scanner;
import java.util.Stack;

//oop, 
public class TumpukanBarang {
  private static Stack<String> tumpukanBarang;
  private static int ukuran;
  private static Scanner inputNum = new Scanner(System.in);
  private static Scanner inputText = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Berapa jumlah Barang yang diinginkan? ");
    ukuran = inputNum.nextInt();
    inisialisasiTumpukanBarang();

    int pilihan = 0;
    while (pilihan != 4) {
      System.out.println("1. Masukkan Data Barang");
      System.out.println("2. Keluarkan Data Barang");
      System.out.println("3. Lihat Data Barang");
      System.out.println("4. Keluar");
      System.out.print("  : ");
      pilihan = inputNum.nextInt();
      switch (pilihan) {
        case 1:
          masukkan();
          break;
        case 2:
          lihatData();
          break;
        case 3:
          lihatPalingAtas();
          break;
        case 4:
          System.out.println("Keluar aplikasi");
          break;
        default:
          System.out.println("Pilihan tidak ada");
          break;
      }

    }
  }

  private static void inisialisasiTumpukanBarang() {
    tumpukanBarang = new Stack<String>();
  }

  private static void masukkan() {
    String barang;
    System.out.println("Masukkan Barang");
    for (int i = 0; i < ukuran; i++) {
      System.out.print("Data ke-" + (i + 1) + ": ");
      barang = inputText.nextLine();
      tumpukanBarang.push(barang);
    }
  }

  private static void lihatData() {
    System.out.println("Melihat isi tumpukan (menggunakan pop) ");
    String barang;
    for (int i = 0; i < ukuran; i++) {
      barang = tumpukanBarang.pop();
      System.out.println("Barang = " + barang + " dikeluarkan");
    }
  }

  private static void lihatPalingAtas() {
    System.out.println("Melihat tumpukan paling atas ");
    String barang;
    barang = tumpukanBarang.peek();
    System.out.println("Nilainya = " + barang);
  }

}