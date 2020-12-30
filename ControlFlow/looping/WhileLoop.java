package looping;

import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai n= ");
    int n = input.nextInt();
    int i = 1;
    while (i <= n) {
      System.out.print(i + " ");
      i++;
    }
    input.close();
  }
}
