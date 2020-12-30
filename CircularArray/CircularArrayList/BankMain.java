import java.util.Scanner;

public class BankMain {
  private static Scanner inputNum = new Scanner(System.in);
  private static Scanner inputText = new Scanner(System.in);

  public static void main(String[] args) {
    int menu = 0;
    System.out.print("Masukkan Jumlah Antrian Yang Tersedia: ");
    int jumlahAntrian = inputNum.nextInt();
    CircularData q = new CircularData(jumlahAntrian);

    while (menu != 4) {
      System.out.println("------------------------------------");
      System.out.println("Maksimal Antrian = " + q.size);
      System.out.println("Antrian Saat ini = " + (q.front == -1 ? "Antrian Kosong" : (q.front)));
      System.out.print("1. Masukkan Antrian Baru\n2. Panggil Antrian Selanjutnya\n3. Lihat Antrian\n4. Exit\n   : ");
      menu = inputNum.nextInt();
      switch (menu) {
        case 1:
          String nama, keperluan;
          System.out.print("Nama       : ");
          nama = inputText.nextLine();
          System.out.print("Keperluan  : ");
          keperluan = inputText.nextLine();
          q.enqueue(new BankModel((q.rear + 2), nama, keperluan));
          break;
        case 2:
          BankModel dipanggil = q.dequeue();
          System.out.println("Memanggil Antrian");
          dipanggil.display();
          break;
        case 3:
          q.displayQueue();
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
