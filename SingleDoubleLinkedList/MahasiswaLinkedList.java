import java.util.Scanner;

class MNode {
  String data;
  MNode next;

  public MNode(String data) {
    this.data = data;
  }

  public void tampil() {
    System.out.println("{" + data + "}");
  }
}

class MLinkedList {
  MNode first;

  public MLinkedList() {
    first = null;
  }

  public boolean isEmpty() {
    return (first == null);
  }

  public void addFirst(String data) {
    MNode mnode = new MNode(data);
    mnode.next = first;
    first = mnode;
  }

  public void addLast(String data) {
    MNode mnode, help;
    mnode = new MNode(data);
    mnode.next = null;
    if (isEmpty()) {
      first = mnode;
      first.next = null;
    } else {
      help = first;
      while (help.next != null) {
        help = help.next;
      }
      help.next = mnode;
    }
  }

  public MNode deleteFirst() {
    if (!isEmpty()) {
      MNode temp = first;
      first = first.next;
      return temp;
    } else {
      return null;
    }
  }

  public MNode deleteLast() {
    if (!isEmpty()) {
      MNode temp, current;
      current = first;
      while (current.next.next != null) {
        current = current.next;
      }
      temp = current.next;
      current.next = null;
      return temp;
    } else {
      MNode temp = first;
      first = null;
      return temp;
    }
  }

  public void tampilkan() {
    MNode current = first;
    if (current == null) {
      System.out.println("Kosong!");
    } else {
      while (current != null) {
        current.tampil();
        current = current.next;
      }
      System.out.println();
    }
  }
}

public class MahasiswaLinkedList {
  public static Boolean search(MLinkedList link, String search) {
    MNode current = link.first;
    while (current != null) {
      if (current.data.equalsIgnoreCase(search)) {
        System.out.println("Mahasiswa ditemukan!");
        current.tampil();
        System.out.println();
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public static void sort(MLinkedList link, Boolean type) {
    MNode current, index;
    current = link.first;
    while (current != null) {
      index = current.next;
      while (index != null) {
        if (type) {
          if (current.data.compareTo(index.data) > 0) {
            String temp = current.data;
            current.data = index.data;
            index.data = temp;
          }

        } else {
          if (current.data.compareTo(index.data) < 0) {
            String temp = current.data;
            current.data = index.data;
            index.data = temp;
          }
        }
        index = index.next;
      }
      current = current.next;
    }

  }

  public static void main(String[] args) {
    MLinkedList link = new MLinkedList();
    Scanner inputString = new Scanner(System.in);
    Scanner inputNum = new Scanner(System.in);

    System.out.print("Masukkan Jumlah Mahasiswa\n\t: ");
    int n = inputNum.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.print("Mahasiswa ke-" + (i + 1) + " : ");
      String nama = inputString.nextLine();
      link.addFirst(nama);
    }
    System.out.println("\nMenampilkan Data Mahasiswa");
    link.tampilkan();

    System.out.println("Mengurutkan Data Mahasiswa");
    System.out.println("Ascending");
    sort(link, true);
    link.tampilkan();
    System.out.println("Descending");
    sort(link, false);
    link.tampilkan();

    System.out.println("Mencari Data Mahasiswa");
    String cari = inputString.nextLine();
    Boolean res = search(link, cari);
    if (!res)
      System.out.println("Mahasiswa tidak ditemukan!");

    inputString.close();
    inputNum.close();
  }
}