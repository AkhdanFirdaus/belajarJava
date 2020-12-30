import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;
import java.io.InputStreamReader;

//oop, 
public class Tumpukan {
  private static Stack<Integer> stack;
  private static int ukuran;
  // array biasa = 1. length nya harus ditentuinm misal int[] num = new int[10] ->
  // 11 => error out of range. 2. method kayak add/push/pop/clear/dll -> kudu
  // bikin manual;
  // stack = length nya tergantung kita masukkin, gada batasan. 2.

  // private static Scanner scan = new Scanner(system.in)
  // public Scanner input() {
  // return new
  // }

  public static void main(String[] args) {
    System.out.print("Berapa ukuran stack yang diinginkan? ");
    ukuran = inputData();
    buatStack(); // -> inisialisasi si stack, kalau gak nanti stack = null; gakan bisa di apa
                 // apain;
    bacaData();
    tulisData();
  }

  // ngoding kebanyak -> kodingan sama aja fungsinya/redundan => boilerplate
  private static void buatStack() {
    stack = new Stack<Integer>();
    // arrayNum;
    // fungsi nya hanya sebatas manipulasi umum
    // blokini
  }

  private static void bacaData() {
    int data;
    System.out.println("Masukkan nilai stack");
    for (int i = 0; i < ukuran; i++) {
      System.out.print("Data ke-" + (i + 1) + ": ");
      data = inputData();
      stack.push(data);
    }
  }

  private static void tulisData() {
    System.out.println("Isi stack adalah (menggunakan pop)");
    int dataStack;
    for (int i = 0; i < ukuran; i++) {
      dataStack = stack.pop();
      System.out.println("Nilainya = " + dataStack);
    }
  }

  // SCanner input = new Sca
  // Scanner input biasa
  // BUffered input ++, bisa input file, input audio, input text, input segala
  // jenis file

  // try-catch => melakukan sesuatu sampai sukses, tapi jika gagal akan di tangkap
  // oleh catch

  // int number; 0-...
  // abcd
  // biasa => ngoding -> error otomatis program close
  // try-catch => catch => print ("Error number");

  private static Integer inputData() {
    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    String angkaInput = null;
    try {
      angkaInput = bfr.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    int Data = Integer.valueOf(angkaInput).intValue();
    return Data;
  }
}