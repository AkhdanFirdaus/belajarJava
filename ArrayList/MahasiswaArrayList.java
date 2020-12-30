import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class MahasiswaArrayList {
  public static void main(String[] args) {
    Scanner inputNumber = new Scanner(System.in);
    Scanner inputText = new Scanner(System.in);
    ArrayList<String> arrayList = new ArrayList<String>();
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
      arrayList.add(nama);
      i++;
    }

    System.out.println("Selesai menambahkan nama mahasiswa");
    System.out.println("Menampilkan nama mahasiswa");
    Iterator<String> mahasiswa = arrayList.iterator();
    while (mahasiswa.hasNext()) {
      String nama = mahasiswa.next();
      System.out.println(nama);
    }

    inputNumber.close();
    inputText.close();
  }
}