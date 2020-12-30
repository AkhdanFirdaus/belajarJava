import java.util.Scanner;

public class NilaiMahasiswa {
  private static String hasilNilai(int nilai) {
    if (nilai >= 85) {
      return "A";
    } else if (nilai >= 75) {
      return "AB";
    } else if (nilai >= 65) {
      return "B";
    } else if (nilai >= 50) {
      return "BC";
    } else if (nilai >= 35) {
      return "C";
    } else if (nilai >= 20) {
      return "C";
    } else if (nilai >= 0) {
      return "C";
    } else {
      return "T";
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Nilai Anda (dalam angka): ");
    int nilai = input.nextInt();
    String hasil = hasilNilai(nilai);
    System.out.println("Nilai Anda adalah " + hasil);
    input.close();
  }
}
