public class Mahasiswa {
  private int nim;
  private String nama;

  public Mahasiswa(int nim, String nama) {
    this.nim = nim;
    this.nama = nama;
  }

  public int getNim() {
    return this.nim;
  }

  public String getNama() {
    return this.nama;
  }

  public void show() {
    System.out.println("NIM   : " + getNim());
    System.out.println("Nama  : " + getNama());
  }
}
