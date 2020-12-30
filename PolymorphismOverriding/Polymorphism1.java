public class Polymorphism1 {
  public static void main(String[] args) {
    cetakObyek(new Balok());
    cetakObyek(new PersegiPanjang());
    cetakObyek(new BangunDatar());
    cetakObyek(new Object());
  }

  public static void cetakObyek(Object obyek) {
    System.out.println(obyek);
  }
}

// akhir kelas polymorphism
class Balok extends PersegiPanjang {
  public String toString() {
    return "Mempunyai sisi panjang, lebar dan tinggi";
  }
}

class PersegiPanjang extends BangunDatar {
  public String toString() {
    return "Mempunyai sisi panjang dan lebar";
  }
}

class BangunDatar extends Object {
  public String toString() {
    return "mempunyai berbagai bentuk";
  }
}