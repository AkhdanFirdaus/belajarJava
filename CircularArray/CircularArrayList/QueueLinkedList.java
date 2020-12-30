import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
  // deklarasi queue dengan linked list menggunakan tipe data integer
  Queue<Integer> queue = new LinkedList<Integer>();

  public static void main(String[] args) {
    // menginisialisasi class menjadi objek
    QueueLinkedList app = new QueueLinkedList();

    // mengambil panjang queue secara dinamis
    int panjangQueue = app.queue.size();

    // menghapus semua queue
    for (int i = 0; i < panjangQueue; i++) {
      app.dequeue();
    }
  }

  public void dequeue() {
    // menghapus data queue dan langsung menampilkannya
    int terhapus = queue.remove();
    System.out.println("Data " + terhapus + " telah terhapus");
  }
}

/*
 * queue.remove() setara dengan kodingan manual seperti // check if queue is
 * empty if (front == rear) { System.out.printf("\nQueue is empty\n"); return; }
 * 
 * // shift elements to the right by one place uptil rear else { for (int i = 0;
 * i < rear - 1; i++) { queue[i] = queue[i + 1]; }
 * 
 * // set queue[rear] to 0 if (rear < capacity) queue[rear] = 0; // decrement
 * rear rear--; } return;
 */
