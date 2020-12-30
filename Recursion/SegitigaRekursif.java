public class SegitigaRekursif {
  public static void main(String[] args) {
    printSegitigaSiku(1, 1, 5);
  }

  public static void printSegitigaSiku(int baris, int kolom, int batas) {
    if (baris <= batas) {
      if (kolom <= baris) {
        System.out.print("* ");
      }

      if (kolom == baris) {
        System.out.println();
        printSegitigaSiku(++baris, 1, batas);
      } else {
        printSegitigaSiku(baris, ++kolom, batas);
      }
    }
  }
}
