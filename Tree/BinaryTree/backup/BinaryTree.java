package backup;

import java.util.Scanner;

public class BinaryTree {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    BT bt = new BT();
    System.out.println("Binary Tree Test\n");
    char ch;

    do {
      System.out.println("\nBinary Tree Operations");
      System.out.println("\n1. Insert");
      System.out.println("\n2. Search");
      System.out.println("\n3. Count Nodes");
      System.out.println("\n4. Check Empty");
      System.out.print(" : ");
      int choice = scan.nextInt();
      switch (choice) {
        case 1:
          System.out.print("Enter integer element to insert : ");
          bt.insert(scan.nextInt());
          break;
        case 2:
          System.out.print("Enter integer element to search: ");
          System.out.print("Search result : " + bt.search(scan.nextInt()));
          break;
        case 3:
          System.out.print("Nodes : " + bt.countNodes());
          break;
        case 4:
          System.out.print("Empty status : " + bt.isEmpty());
          break;
        default:
          System.out.println("Wrong Entry\n");
          break;

      }
      System.out.println("\nPost Order : ");
      bt.postOrder();
      System.out.println("\nPre Order : ");
      bt.inorder();
      System.out.println("\nIn Order : ");
      bt.preorder();
      System.out.print("\n\nDo you want to continue (Type y or n) ");
      ch = scan.next().charAt(0);
    } while (ch == 'Y' || ch == 'y');
    scan.close();
  }
}
