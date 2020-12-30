import java.util.Stack;

public class Setrikaan {
  public static Stack<String> sebelum = new Stack<String>();
  public static Stack<String> sesudah = new Stack<String>();

  public static void main(String[] args) {
    int banyakBaju = 5;
    for (int i = 1; i <= banyakBaju; i++) {
      sebelum.push("Baju " + i);
    }

    System.out.println("BAJU SEBELUM DISETRIKA");
    display();
    System.out.println("Tumpukan baju sebelum disetrika:");
    for (int i = 0; i < banyakBaju; i++) {
      System.out.println(sesudah.push(sebelum.pop()));
    }

    System.out.println("SETELAH DISETRIKA");
    display();
    System.out.println("Tumpukan baju setelah disetrika:");
    for (int i = 0; i < banyakBaju; i++) {
      System.out.println(sesudah.pop());
    }
  }

  public static void display() {
    System.out.println("Jumlah baju sebelum disetrika   : " + sebelum.size());
    System.out.println("Jumlah baju setelah disetrika   : " + sesudah.size());
  }

}