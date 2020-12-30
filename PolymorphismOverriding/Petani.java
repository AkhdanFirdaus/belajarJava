class Pekerjaan {
  public static void perkenalan(String nama) {
    System.out.println("Halo, nama saya " + nama);
  }

  public static void perkenalan(String nama, String pekerjaan) {
    System.out.println("Halo, nama saya " + nama);
    System.out.println("Saya bekerja sebagai pegawai");
  }

  public static void perkenalan(String nama, String pekerjaan, int jam) {
    System.out.println("Halo, nama saya " + nama);
    System.out.println("Saya bekerja sebagai pegawai");
    System.out.println("Saya biasa bekerja selama " + jam + " jam sehari");
  }
}

public class Petani extends Pekerjaan {
  public static void main(String[] args) {
    System.out.println("Program polymorphism overloading");
    System.out.println("----------------------------------------");
    perkenalan("Budi");
    System.out.println("----------------------------------------");
    perkenalan("Budi", "Petani");
    System.out.println("----------------------------------------");
    perkenalan("Budi", "Petani", 8);
    System.out.println("----------------------------------------");
  }
}
