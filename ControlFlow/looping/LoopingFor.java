package looping;

import java.util.Scanner;

public class LoopingFor {
  public static void main(String[] args) {
    int jumlah;
    int x;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan Jumlah Perulangan = ");
    jumlah = scan.nextInt();
    scan.close();

    for (x = 1; x <= jumlah; x++) {
      System.out.println("Nomor ke- " + x);
    }
  }
}