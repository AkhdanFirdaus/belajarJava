import java.util.Scanner;

public class LampuLaluLintas {
  public static void main(String[] args) {
    String warna;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan Warna = ");
    warna = scan.nextLine();

    if (warna.toUpperCase().contains("MERAH")) {
      System.out.println("Berhenti!");
    } else if (warna.toUpperCase().contains("KUNING")) {
      System.out.println("Hati-hati!");
    } else if (warna.toUpperCase().contains("HIJAU")) {
      System.out.println("Jalan!");
    } else {
      System.out.println("Warna salah!");
    }

    scan.close();
  }
}