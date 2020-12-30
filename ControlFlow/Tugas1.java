import java.util.Scanner;

public class Tugas1 {
  public static void main(String[] args) {
    String nama;
    int nilai;
    String keterangan;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Masukkan nama: ");
    nama = scan.nextLine();

    System.out.print("Masukkan nilai: ");
    nilai = scan.nextInt();

    if (nilai >= 60) {
      keterangan = "Lulus";
    } else {
      keterangan = "Tidak Lulus";
    }

    System.out.println("\nNama: " + nama + ", Keterangan: " + keterangan);

    scan.close();
  }
}