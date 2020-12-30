import java.util.Scanner;

public class PangkatRekursif {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan nilai bil pokok: ");
    int x = input.nextInt();
    System.out.print("Masukan nilai pangkat: ");
    int y = input.nextInt();
    input.close();

    System.out.println(x + " dipangkatkan " + y + " = " + hitungPangkat(x, y));
  }

  public static int hitungPangkat(int basis, int pangkat) {
    if (pangkat == 0) {
      return 1;
    } else {
      return basis * hitungPangkat(basis, pangkat - 1);
    }
  }
}
