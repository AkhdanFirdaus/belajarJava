import java.util.Scanner;
import java.util.InputMismatchException;

public class NilaiMahasiswa {
  private static Scanner inputNum = new Scanner(System.in);
  private static Scanner inputText = new Scanner(System.in);

  public int size;
  public Mahasiswa daftarMahasiswa[];

  public static void main(String[] args) {
    NilaiMahasiswa app = new NilaiMahasiswa();

    System.out.print("Masukkan banyak mahasiswa : ");
    app.size = app.inputNum();

    app.daftarMahasiswa = new Mahasiswa[app.size];

    for (int i = 0; i < app.size; i++) {
      System.out.println("Mahasiswa " + (i + 1));
      System.out.print("Masukkan nama       : ");
      String nama = app.inputText();
      System.out.print("Masukkan nilai uts  : ");
      int nilaiUTS = app.inputNum();
      System.out.print("Masukkan nilai uas  : ");
      int nilaiUAS = app.inputNum();
      System.out.println("-------------------------------------");

      app.daftarMahasiswa[i] = new Mahasiswa(nama, nilaiUTS, nilaiUAS);
    }

    for (int i = 0; i < app.size; i++) {
      Mahasiswa mahasiswa = app.daftarMahasiswa[i];
      System.out.println("Mahasiswa " + (i + 1));
      System.out.println("Nama      : " + mahasiswa.nama);
      System.out.println("Nilai UTS : " + mahasiswa.nilaiUTS);
      System.out.println("Nilai UAS : " + mahasiswa.nilaiUAS);
      System.out.println("Hasil     : " + mahasiswa.getHasilAkhir());
      System.out.println("-------------------------------------");
    }
  }

  public int inputNum() {
    try {
      return inputNum.nextInt();
    } catch (InputMismatchException error) {
      System.out.println("Input harus nomor");
      inputNum.next();
      return 0;
    }
  }

  public String inputText() {
    try {
      return inputText.nextLine();
    } catch (InputMismatchException error) {
      System.out.println("Input harus alphanumeric");
      inputText.next();
      return null;
    }
  }
}

class Mahasiswa {
  String nama;
  int nilaiUTS;
  int nilaiUAS;

  // konstruktor
  public Mahasiswa(String nama, int nilaiUTS, int nilaiUAS) {
    this.nama = nama;
    this.nilaiUAS = nilaiUAS;
    this.nilaiUTS = nilaiUTS;
  }

  // method getter
  public double getHasilAkhir() {
    // Nilai Akhir = (nilaiUTS x 40%) + (nilaiUAS x 60%)
    return (this.nilaiUTS * 0.4) + (this.nilaiUAS * 0.6);
  }

}