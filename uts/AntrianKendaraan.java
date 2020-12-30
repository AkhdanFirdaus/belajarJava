import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AntrianKendaraan {

  private static Scanner inputInteger = new Scanner(System.in);
  private static Scanner inputString = new Scanner(System.in);
  private Queue<String> queue = new LinkedList<String>();

  public static void main(String[] args) {
    AntrianKendaraan app = new AntrianKendaraan();
    int menu = 0;

    while (menu != 4) {
      System.out.println("1. Enqueue");
      System.out.println("2. Dequeue");
      System.out.println("3. Tampilkan data");
      System.out.println("4. Exit");
      System.out.print("  : ");

      try {
        menu = inputInteger.nextInt();
      } catch (InputMismatchException error) {
        System.out.println("Input harus nomor");
        inputInteger.next();
      }

      switch (menu) {
        case 1:
          System.out.println("Enqueue");
          app.menuEnqueue();
          break;
        case 2:
          System.out.println("Dequeue");
          app.menuDequeue();
          break;
        case 3:
          System.out.println("Tampilkan Data");
          app.tampilkanData();
          break;
        case 4:
          System.out.println("Exit");
          menu = 4;
          break;
        default:
          System.out.println("Tidak ada pilihan");
          break;
      }
    }
  }

  public void menuEnqueue() {
    System.out.print("Masukkan plat no: ");
    String platNo = inputString.nextLine();
    queue.add(platNo);
    System.out.println(platNo + " telah masuk antrian");
  }

  public void menuDequeue() {
    String platNo = queue.remove();
    System.out.println(platNo + " telah keluar antrian");
  }

  public void tampilkanData() {
    int i = 0;

    Iterator<String> dataAntrian = queue.iterator();
    while (dataAntrian.hasNext()) {
      System.out.printf("Antrian ke-%d adalah %s\n", ++i, dataAntrian.next());
    }
  }
}