import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryTree {
  private static Scanner scanInt = new Scanner(System.in);
  private static Scanner scanString = new Scanner(System.in);

  private static int inputInt() {
    try {
      return scanInt.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Input harus berupa angka");
      scanInt.next();
      return 0;
    }
  }

  public static void main(String[] args) {
    BT bt = new BT();
    System.out.println("Binary Tree Mahasiswa\n");
    int choice = 0;

    do {
      System.out.println("\nBinary Tree Operations");
      System.out.println("\n1. Insert");
      System.out.println("\n2. Search");
      System.out.println("\n3. Count Nodes");
      System.out.println("\n4. Check Empty");
      System.out.println("\n5. Exit");
      System.out.print(" : ");
      choice = inputInt();
      switch (choice) {
        case 1:
          System.out.println("Enter Mahasiswa element to insert");
          System.out.print("NIM   : ");
          int nim = inputInt();
          System.out.print("Nama  : ");
          String nama = scanString.nextLine();
          bt.insert(new Mahasiswa(nim, nama));
          break;
        case 2:
          System.out.println("Search : ");
          System.out.println("1. By Nim");
          System.out.println("2. By Name");
          System.out.print(" : ");
          int tipe = inputInt();
          switch (tipe) {
            case 1:
              System.out.print("Keyword       : ");
              int keywordNim = inputInt();
              System.out.println("Search result : " + bt.search(new Mahasiswa(keywordNim, null), true));
              break;
            case 2:
              System.out.print("Keyword       : ");
              String keywordNama = scanString.nextLine();
              System.out.print("Search result : " + bt.search(new Mahasiswa(0, keywordNama), false));
              break;
            default:
              System.out.println("Pilihan tidak ada!");
              break;
          }
          break;
        case 3:
          System.out.print("Nodes : " + bt.countNodes());
          break;
        case 4:
          System.out.print("Empty status : " + bt.isEmpty());
          break;
        case 5:
          System.out.print("Exit Applications");
          break;
        default:
          System.out.println("Wrong Entry\n");
          break;

      }
      System.out.println("\nPre Order : ");
      bt.preorder();
      System.out.println("\nIn Order : ");
      bt.inorder();
      System.out.println("\nPost Order : ");
      bt.postOrder();
    } while (choice != 5);
  }
}
