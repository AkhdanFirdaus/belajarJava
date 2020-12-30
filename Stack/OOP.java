import java.util.Scanner;

// access modifier => public, private, protected
// public => bisa diakses dimana aja
// private => bisa diakses di file ini aja
// protected => bisa diakses sama yang ngewarisin

// class => blueprint/rancangan/skema/fondasi
// 

//Fruit punya data masing masing
class Fruit {
  // property/field/variabel

  // camel case namaSayaAdalah
  public String nama;
  private String namaLokal;

  // Scope Variabel / ruang lingkup

  // method/fungsi
  // fungsi sama prosedur
  // fungsi ada return
  // prosedure cuman nampilin, gada return

  // prosedur
  public void tampilNama(String nama) {
    System.out.println(this.nama);
    System.out.println(nama);
    // langsung di prin di cmd
  }

  // fungsi
  public String tampilNama2() {
    System.out.println(nama);
    // harus ditampung
    return "Ini jeruk";
  }
}

// aturan penamaan class => harus kapital
public class OOP {
  public static void main(String[] args) {
    // objek => Class yang dibikin variabel
    Fruit objek = new Fruit();
    objek.nama = "Jeruk";
    objek.tampilNama("Apel");
    System.out.println(objek.tampilNama2());
  }
}
