public class BankModel {
  int id;
  String nama, keperluan;

  public BankModel(int id, String nama, String keperluan) {
    this.id = id;
    this.nama = nama;
    this.keperluan = keperluan;
  }

  public void display() {
    System.out.println("ID        = " + this.id);
    System.out.println("Nama      = " + this.nama);
    System.out.println("Keperluan = " + this.keperluan);
  }
}
