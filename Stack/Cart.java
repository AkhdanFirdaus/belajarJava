import java.io.BufferedReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Cart {
  public class Item {
    public int id;
    public String name;
    public int price;
    public int qty;

    Item(int id, String name, int price) {
      this.id = id + 1;
      this.name = name;
      this.price = price;
    }

    public void showItem() {
      System.out.println("Name  : " + this.name);
      System.out.println("Price : " + this.price);
      System.out.println("Qty   : " + this.qty);
    }
  }

  private Scanner input() {
    return new Scanner(System.in);
  }

  private Stack<Item> carts = new Stack<Item>();

  public static void main(String[] args) {
    initItems();
    System.out.println("Mesin Birupay");
    System.out.println("1.");
  }

  public void initItems() {
    String items[] = {"Sprite", "Coca-cola", "Kerupuk"};
    for (int i=0; i<)
  }
}