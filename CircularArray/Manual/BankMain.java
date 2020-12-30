package Manual;

import java.util.Scanner;

public class BankMain {
  private static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int menu = 0;
    BankLinked queue = new BankLinked();
    while (menu != 4) {
      System.out.println("Jumlah Antrian: " + queue.size);
      System.out.print("1. Masukkan Antrian Baru\n2. Panggil Nomor Selanjutnya\n3. Lihat Antrian\n4. Exit\n   : ");
      menu = scan.nextInt();
      switch (menu) {
        case 1:
          queue.enqueue();
          break;
        case 2:
          queue.dequeue();
          break;
        case 3:
          queue.view();
          break;
        case 4:
          System.out.println("- Keluar -");
          break;
        default:
          System.out.println("- Tidak ada -");
          break;
      }
    }
  }
}
