import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Keranjang {
  // inisialisasi
  // 1. bisa langsung inline
  private static Stack<Item> cart;
  public static Scanner inputString = new Scanner(System.in);
  public static Scanner inputInteger = new Scanner(System.in);

  // method/fungsi/prosedur
  private static void inisialisasiCart() {
    cart = new Stack<Item>();
  }

  public static void main(String[] args) {
    // Keranjang objek = new Keranjang();
    inisialisasiCart();
    int menu = 0;
    while (menu != 4) {
      // push, pop, peek
      System.out.println("1. Tambah Item ke Keranjang");
      System.out.println("2. Keluarkan Item paling Atas");
      System.out.println("3. Keluarkan Item paling Atas");
      System.out.println("4. Lihat Item paling Atas");
      menu = inputInteger.nextInt();
      switch (menu) {
        case 1:
          System.out.println("Masukkan item");
          System.out.print("Nama   : ");
          String nama = inputString.nextLine();
          System.out.print("price  : ");
          int price = inputInteger.nextInt();
          System.out.print("qty    : ");
          int qty = inputInteger.nextInt();

          int id = cart.size(); // 0
          // id++
          // id = id + 1;
          // id+=1

          // ++id id = 1 + id;
          Item item = new Item(++id, nama, price, qty);
          cart.push(item);
          break;
        case 2:
          System.out.println("Keluarkan Semua Barnag");

          // for (int i=0; i<1000; i++) => error
          // for (int i=0; i<cart.size(); i++) {
          // System.out.println(cart[i].nama);
          // System.out.println(cart[i].price);
          // System.out.println(cart[i].qty);
          // }

          // foreach ngeluarin semua nilai,
          for (Item i : cart) {
            i.tampilItem();
          }

          // Iterator items = cart.iterator();
          // while (items.hasNext()) {
          // items.next();
          // }

          break;
        case 3:
          System.out.println("Keluarkan Barang paling atas");
          Item itemDihapus = cart.pop();
          itemDihapus.tampilItem();
          break;
        case 4:
          System.out.println("Keluarkan Barang paling atas");
          Item itemPalingAtas = cart.peek();
          itemPalingAtas.tampilItem();
          break;

        default:
          break;
      }
    }

  }
}

class Item {
  int id;
  String nama;
  int price;
  int qty;

  // constructor
  Item(int id, String nama, int price, int qty) {
    this.id = id;
    this.nama = nama;
    this.price = price;
    this.qty = qty;
  }

  public void tampilItem() {
    System.out.println(this.nama);
    System.out.println(this.price);
    System.out.println(this.qty);
  }
}

// id == nim, gaboleh ada id/nim yang sama
