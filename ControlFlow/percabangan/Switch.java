package percabangan;

import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {

    int day;
    Scanner input = new Scanner(System.in);

    System.out.println("Contoh Switch Case");
    System.out.println("Memilih hari");
    System.out.print("Masukkan nomor[1-7]: ");
    day = input.nextInt();

    switch (day) {
      case 1:
        System.out.println("Anda memilih hari Senin");
        break;
      case 2:
        System.out.println("Anda memilih hari Selasa");
        break;
      case 3:
        System.out.println("Anda memilih hari Rabu");
        break;
      case 4:
        System.out.println("Anda memilih hari Kamis");
        break;
      case 5:
        System.out.println("Anda memilih hari Jumat");
        break;
      case 6:
        System.out.println("Anda memilih hari Sabtu");
        break;
      case 7:
        System.out.println("Anda memilih hari Minggu");
        break;
      default:
        System.out.println("Hari tidak ada");
        break;
    }

    input.close();

  }

}