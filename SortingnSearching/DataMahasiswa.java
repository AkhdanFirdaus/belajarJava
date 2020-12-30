import java.util.Scanner;
import java.util.InputMismatchException;

public class DataMahasiswa {
  public static int size;
  public static Mahasiswa daftarMahasiswa[];
  private static Scanner inputNumber = new Scanner(System.in);
  private static Scanner inputText = new Scanner(System.in);

  public static void main(String[] args) {
    int pilihan = 0;
    while (pilihan != 5) {
      System.out.println("1. Masukkan Data");
      System.out.println("2. Tampilkan Data");
      System.out.println("3. Sort By NIM");
      System.out.println("4. Search");
      System.out.println("5. Keluar");
      System.out.print("  : ");
      pilihan = inputNum();
      switch (pilihan) {
        case 1:
          System.out.print("Masukkan banyak mahasiswa : ");
          size = inputNum();

          daftarMahasiswa = new Mahasiswa[size];
          for (int i = 0; i < size; i++) {
            System.out.println("Mahasiswa " + (i + 1));
            System.out.print("Masukkan nim  : ");
            int nim = inputNum();
            System.out.print("Masukkan nama : ");
            String nama = inputText();
            System.out.println("-------------------------------------");
            daftarMahasiswa[i] = new Mahasiswa(nim, nama);
          }
          break;
        case 2:
          if (size > 0)
            tampil();
          else
            System.out.println("Tidak ada data");
          break;
        case 3:
          if (size > 0) {
            QuickSort quickSort = new QuickSort();
            System.out.println("Daftar Mahasiswa sebelum diurutkan : ");
            tampil();
            quickSort.sort(daftarMahasiswa, 0, size - 1);
            System.out.println("Daftar Mahasiswa setelah diurutkan : ");
            tampil();
          } else
            System.out.println("Tidak ada data");
          break;
        case 4:
          if (size > 0) {
            LinearSearch linearSearch = new LinearSearch();
            System.out.println("1. Cari berdasar nim");
            System.out.println("2. Cari berdasar nama");
            System.out.print("  : ");
            int tipe = inputNum();
            System.out.println("Cari berdasarkan " + (tipe == 1 ? "nim" : "nama"));
            System.out.print("Kata Kunci: ");
            String cari = inputText();
            linearSearch.search(daftarMahasiswa, size, cari, tipe);
          } else
            System.out.println("Tidak ada data");
          break;
        case 5:
          System.out.println("Keluar dari aplikasi");
          break;
        default:
          System.out.println("Pilihan tidak ada");
          break;
      }
    }
  }

  public static void tampil() {
    for (int i = 0; i < size; i++) {
      Mahasiswa mahasiswa = daftarMahasiswa[i];
      System.out.println(mahasiswa.nim + "\t" + mahasiswa.nama);
    }
  }

  public static int inputNum() {
    try {
      return inputNumber.nextInt();
    } catch (InputMismatchException error) {
      System.out.println("Input harus nomor");
      inputNumber.next();
      return 0;
    }
  }

  public static String inputText() {
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
  int nim;
  String nama;

  public Mahasiswa(int nim, String nama) {
    this.nim = nim;
    this.nama = nama;
  }
}

class LinearSearch {
  public void search(Mahasiswa[] array, int size, String search, int type) {
    Boolean found = false;
    int i;

    for (i = 0; i < size; i++) {
      if (search.contains(searchBy(type, array[i]))) {
        found = true;
        break;
      }
    }

    if (found)
      System.out.println(array[i].nim + "-" + array[i].nama + " ditemukan, ada di indeks " + (i + 1) + ".");
    else
      System.out.println(search + " tidak ditemukan");
  }

  private static String searchBy(int type, Mahasiswa mhs) {
    return type == 1 ? String.valueOf(mhs.nim) : mhs.nama;
  }
}

class QuickSort {
  public static void swap(Mahasiswa A[], int x, int y) {
    Mahasiswa temp = A[x];
    A[x] = A[y];
    A[y] = temp;
  }

  public static int partition(Mahasiswa A[], int f, int i) {
    Mahasiswa pivot = A[f];
    while (f < i) {
      while (A[f].nim < pivot.nim)
        f++;
      while (A[i].nim > pivot.nim)
        i--;
      swap(A, f, i);
    }
    return f;
  }

  public static String getType(int type, Mahasiswa mhs) {
    return type == 1 ? String.valueOf(mhs.nim) : mhs.nama;
  }

  public void sort(Mahasiswa A[], int f, int i) {
    if (f >= i)
      return;
    int pivotIndex = partition(A, f, i);
    sort(A, f, pivotIndex);
    sort(A, pivotIndex + 1, i);
  }
}