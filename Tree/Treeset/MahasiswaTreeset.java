import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class MahasiswaTreeset {
  public static void main(String[] args) {
    Scanner inputNumber = new Scanner(System.in);
    Scanner inputText = new Scanner(System.in);
    TreeSet<String> treeSet = new TreeSet<String>();
    int size = 0;

    System.out.print("Jumlah Mahasiswa: ");
    try {
      size = inputNumber.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Input harus angka");
      inputNumber.nextLine();
    }

    int i = 0;
    while (i < size) {
      System.out.print("Masukkan nama Mahasiswa: ");
      String nama = inputText.nextLine();
      treeSet.add(nama);
      i++;
    }

    System.out.println("Selesai menambahkan nama mahasiswa");
    System.out.println("Menampilkan nama mahasiswa");
    Iterator<String> mahasiswa = treeSet.iterator();
    while (mahasiswa.hasNext()) {
      String nama = mahasiswa.next();
      System.out.println(nama);
    }

    inputNumber.close();
    inputText.close();
  }
}