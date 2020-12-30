import java.util.ArrayList;

public class CircularData {
  public int size, front, rear;
  public ArrayList<BankModel> queue = new ArrayList<BankModel>();

  CircularData(int size) {
    this.size = size;
    // this.front = -1;
    // this.rear = -1;
    // equals to
    this.front = this.rear = -1;
  }

  public void enqueue(BankModel data) {
    if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
      System.out.println("Antrian penuh");
    } else if (front == -1) {
      front = 0;
      rear = 0;
      queue.add(rear, data);
    } else if (rear == size - 1 && front != 0) {
      rear = 0;
      queue.set(rear, data);
    } else {
      rear = rear + 1;
      if (front <= rear) {
        queue.add(rear, data);
      } else {
        queue.set(rear, data);
      }
    }
  }

  public BankModel dequeue() {
    BankModel temp;
    if (front == -1) {
      System.out.println("Antrian kosong");
      return null;
    }

    temp = queue.get(front);
    if (front == rear) {
      front = -1;
      rear = -1;
    } else if (front == size - 1) {
      front = 0;
    } else {
      front = front + 1;
    }
    return temp;
  }

  public void displayQueue() {
    if (front == -1) {
      System.out.println("Antrian Kosong");
      ;
      return;
    }

    System.out.println("Antrian di queue = ");

    if (rear >= front) {
      for (int i = front; i <= rear; i++) {
        queue.get(i).display();
        System.out.println();
      }

      // for (int i = 0; i <= rear; i++) {
      // queue.get(i).display();
      // System.out.println();
      // }
    }
  }

}
