package looping;

import java.util.Scanner;

public class DoWhileLoop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String username, password;
    int i = 1;

    do {
      System.out.println("Percobaan ke-" + i);
      System.out.print("Username = ");
      username = input.nextLine();
      System.out.print("Password = ");
      password = input.nextLine();
      i++;
    } while (!username.contains("admin") && !password.contains("admin"));

    System.out.println("Sukses Login");

    input.close();
  }
}
