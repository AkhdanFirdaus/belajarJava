import java.util.Scanner;
import java.util.Stack;

//indeks dimulai dari 0, 
// [1, 2, 3, 4, 5, 6]
// ^ peek (nilai paling atas) => output = 6

//scientific
//gak langsung di operasikan, namun di pilah dahulu, aritmatika, sama numerik
//ditampung di 2 array, aritmatika + - * / -> di save lokasi/posisi nya 
// baru dioperasiin setlah user tekan

public class Buku {
  private static Scanner scan = new Scanner(System.in);
  private static Scanner scanString = new Scanner(System.in);
  private static Stack<Book> tumpukanBuku;

  public static void main(String[] args) {
    initTumpukanBukuStack();
    int pilihan = 0;
    while (pilihan != 6) {
      System.out.println("-----------------------------");
      System.out.println(
          "1. Masukkan Buku\n2. Hapus Buku paling atas\n3. Lihat Tumpukan Buku\n4. Lihat Buku paling atas\n5. Lihat buku berdasar id\n6. keluar");
      System.out.print(" : ");
      pilihan = scan.nextInt();
      switch (pilihan) {
        case 1:
          inputBuku();
          break;
        case 2:
          popBuku();
          break;
        case 3:
          lihatTumpukanBuku();
          break;
        case 4:
          lihatPalingAtas();
          break;
        case 5:
          lihatBerdasarId();
          break;
        case 6:
          pilihan = 6;
          System.out.println("Keluar Aplikasi...");
          break;
        default:
          System.out.println("Menu Tidak Ada!");
          break;
      }
    }
  }

  private static void initTumpukanBukuStack() {
    tumpukanBuku = new Stack<Book>();
  }

  private static void inputBuku() {
    System.out.print("Mau memasukkan berapa buku? ");
    int jml = scan.nextInt();

    for (int i = 0; i < jml; i++) {
      System.out.println("-----------------------------");
      System.out.println("Buku ke-" + (i + 1));
      System.out.print("Masukkan id buku      : ");
      int id = scan.nextInt();
      System.out.print("Masukkan judul        : ");
      String judul = scanString.nextLine();
      System.out.print("Masukkan tahun terbit : ");
      int tahun = scan.nextInt();
      Book bukuBaru = new Book(id, judul, tahun);
      tumpukanBuku.push(bukuBaru);
      System.out.println("-----------------------------");
    }
  }

  private static void popBuku() {
    if (tumpukanBuku.isEmpty()) {
      System.out.println("Tumpukan Kosong");
    } else {
      System.out.println("Menghapus Buku Paling atas");
      lihatPalingAtas();
      tumpukanBuku.pop();
      System.out.println("Sekarang Buku Paling atas adalah");
      lihatPalingAtas();
    }

  }

  private static void lihatTumpukanBuku() {
    if (tumpukanBuku.isEmpty()) {
      System.out.println("Tumpukan Kosong");
    } else {
      for (Book hasil : tumpukanBuku) {
        System.out.println("-------------------------");
        hasil.tampilBuku();
      }
    }
  }

  private static void lihatPalingAtas() {
    if (tumpukanBuku.isEmpty()) {
      System.out.println("Tumpukan Kosong");
    } else {
      Book hasil = tumpukanBuku.peek();
      hasil.tampilBuku();
    }
  }

  private static void lihatBerdasarId() {
    if (tumpukanBuku.isEmpty()) {
      System.out.println("Tumpukan Kosong");
    } else {
      System.out.print("Masukkan id buku : ");
      int id = scan.nextInt();
      Book hasil = tumpukanBuku.get(id - 1);
      hasil.tampilBuku();
      // System.out.println("ID : " + hasil.id);
      // System.out.println("Judul : " + hasil.judul);
      // System.out.println("Tahun Terbit: " + hasil.tahun);
    }
  }

}

class Book {

  // ini dibawah teh property
  int id;
  String judul;
  int tahun;

  // ini konstruktor
  // apa sih konstruktor? yaiu method yang selalu dipanggil di awal
  Book(int id, String judul, int tahun) {
    // nah disini mirip kayak override/overload, cuman pake nya keyword this
    // this ini merujuk ke variabel yang diatas(property) sedang yang nggak merujuk
    // ke parameter
    this.id = id;
    this.judul = judul;
    this.tahun = tahun;
  }

  // ini method, ngambil variabel property
  public void tampilBuku() {
    System.out.println("ID          : " + this.id);
    System.out.println("Judul       : " + this.judul);
    System.out.println("Tahun Terbit: " + this.tahun);
  }
}
