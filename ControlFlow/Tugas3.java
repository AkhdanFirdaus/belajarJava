import java.util.Scanner;

public class Tugas3 {
  public static void main(String[] args) {
    //deklarasi
    int bilangan, hasilBagi, sisaBagi;
    Scanner scan = new Scanner(System.in);

    //input
    System.out.print("Input Bilangan: ");
    bilangan = scan.nextInt();

    //proses
    hasilBagi = bilangan/2;
    sisaBagi = bilangan-(hasilBagi*2);

    //percabangan
    if (sisaBagi == 0) {
      System.out.println("Bilangan Genap");
    } else {
      System.out.println("Bilangan Ganjil");
    }

    scan.close();
  }
}
