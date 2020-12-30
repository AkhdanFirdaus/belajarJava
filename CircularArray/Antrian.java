import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.io.InputStreamReader;

public class Antrian {
  private static int ukuran;
  private static Queue<Integer> queue;

  public static void main(String[] args) {
    System.out.print("Berapa ukuran QUEUE yang diinginkan?");
    ukuran = inputData();
    buatQueue();
    bacaData();
    tulisData();
  }

  private static void buatQueue() {
    queue = new LinkedList<Integer>();
  }

  private static int inputData() {
    BufferedReader bfr = new BufferedReader(new InputStreamReader((System.in)));
    String angkaInput = null;
    try {
      angkaInput = bfr.readLine();
    } catch (Exception e) {
      e.printStackTrace();
    }
    int data = Integer.valueOf(angkaInput).intValue();
    return data;
  }

  private static void bacaData() {
    Integer data;
    for (int i = 0; i < ukuran; i++) {
      System.out.print("Data ke-" + (i + 1) + ": ");
      data = inputData();
      queue.add(data);
    }

    data = queue.size();
    System.out.println("Ukuran QUEUE sekarang adalah " + data);
  }

  private static void tulisData() {
    Integer data;
    System.out.println("\n Ukuran keluar elemen dari QUEUE: ");
    for (int i = 0; i < ukuran; i++) {
      data = queue.remove();
      System.out.println("Data Ke-" + (i + 1) + ": " + data);
    }
    data = queue.size();
    System.out.println("Ukuran QUEUE sekarang adalah " + data);
  }
}