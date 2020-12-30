package percabangan;

import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {

    int nilai;
    Scanner input = new Scanner(System.in);

    System.out.println("Contoh If Else");
    System.out.println("Memilih hari");
    System.out.print("Masukkan nilai: ");
    nilai = input.nextInt();

    if (nilai > 70) {
      System.out.println("Nilai anda mencukupi untuk melanjutkan mata kuliah berikutnya");
    } else {
      System.out.println("Nilai anda belum mencukupi");
    }

    input.close();

  }
}
