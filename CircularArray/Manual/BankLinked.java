package Manual;

public class BankLinked {
  BankModel head, tail;
  int size = 0;

  public BankLinked() {
    head = null;
    tail = null;
  }

  public void enqueue() {
    BankModel newBank = new BankModel();
    newBank.input(++size);
    if (head == null)
      head = newBank;
    else
      tail.next = newBank;
    tail = newBank;
  }

  public void dequeue() {
    if (head == null)
      System.out.println("- Kosong -");
    else {
      System.out.println("Keluar Data dengan id : " + head.id);
      head = head.next;
      size--;
    }
  }

  public void view() {
    if (head == null)
      System.out.println("- Kosong -");
    else {
      System.out.println("|| Id \t || Nama\t\t || Keperluan \t\t ||");
      for (BankModel a = head; a != null; a = a.next)
        a.output();
    }
  }
}
