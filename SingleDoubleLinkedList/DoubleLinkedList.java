class DNode {
  int data;
  DNode next;
  DNode prev;

  public DNode(int data) {
    this.data = data;
  }

  public void tampil() {
    System.out.println("{" + data + "}");
  }
}

class DLinkedList {
  DNode first;
  DNode last;

  public DLinkedList() {
    first = null;
    last = null;
  }

  public boolean isEmpty() {
    return (first == null);
  }

  public void addFirst(int data) {
    DNode node = new DNode(data);
    if (isEmpty())
      last = node;
    else
      first.prev = node;
    node.next = first;
    first = node;
  }

  public void addLast(int data) {
    DNode node = new DNode(data);
    if (isEmpty())
      first = node;
    else
      last.next = node;
    node.prev = last;
    last = node;
  }

  public DNode deleteFirst() {
    DNode temp = first;
    if (first.next == null)
      last = null;
    else
      first.next.prev = null;
    first = first.next;
    return temp;
  }

  public DNode deleteLast() {
    DNode temp = last;
    if (first.next == null)
      first = null;
    else
      last.next.prev = null;
    last = last.next;
    return temp;
  }

  public boolean insertAfter(int key, int data) {
    DNode current = first;
    while (current.data != key) {
      current = current.next;
      if (current == null)
        return false;
    }
    DNode node = new DNode(data);
    if (current == last) {
      node.next = null;
      last = node;
    } else {
      node.next = current.next;
      current.next.prev = node;
    }
    node.prev = current;
    current.next = node;
    return true;
  }

  public DNode deleteKey(int key) {
    DNode current = first;
    while (current.data != key) {
      current = current.next;
      if (current == null)
        return null;
    }
    if (current == first)
      first = current.next;
    else
      current.prev.next = current.next;
    if (current == last)
      last = current.prev;
    else
      current.next.prev = current.prev;
    return current;
  }

  public void displayForward() {
    System.out.println("List (first-->last): ");
    DNode current = first;
    while (current != null) {
      current.tampil();
      current = current.next;
    }
    System.out.println();
  }

  public void displayBackward() {
    System.out.println("List (last-->first): ");
    DNode current = last;
    while (current != null) {
      current.tampil();
      current = current.prev;
    }
    System.out.println();
  }
}

public class DoubleLinkedList {
  public static void main(String[] args) {
    DLinkedList theList = new DLinkedList();
    theList.addFirst(22);
    theList.addFirst(44);
    theList.addFirst(66);
    theList.addLast(11);
    theList.addLast(33);
    theList.addLast(55);
    theList.displayForward();
    theList.displayBackward();
    theList.deleteFirst();
    theList.deleteLast();
    theList.deleteKey(11);
    theList.displayForward();
    theList.insertAfter(22, 77);
    theList.insertAfter(33, 88);
    theList.displayForward();

  }
}