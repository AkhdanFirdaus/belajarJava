import java.util.Scanner;

public class Suhu {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int suhu;

    System.out.print("Masukkan suhu = ");
    suhu = scan.nextInt();

    if (suhu < 0) {
      System.out.println(suhu + " padat");
    } else if (suhu < 100) {
      System.out.println(suhu + " cair");
    } else {
      System.out.println(suhu + " gas");
    }

    scan.close();
  }
}