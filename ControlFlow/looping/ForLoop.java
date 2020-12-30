package looping;

import java.util.Scanner;

public class ForLoop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai n= ");
    int n = input.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    input.close();
  }
}