package Manual;

import java.util.Scanner;

public class BankModel {
  int id;
  String nama, keperluan;
  BankModel next;
  static Scanner inNum = new Scanner(System.in);
  static Scanner inText = new Scanner(System.in);

  public void input(int id) {
    this.id = id;
    System.out.print("Masukkan Nama     : ");
    nama = inText.nextLine();
    System.out.print("Masukkan Keperluan: ");
    keperluan = inText.nextLine();
  }

  public void output() {
    System.out.printf("|| %d || %s || %s ||\n", id, nama, keperluan);
  }
}
