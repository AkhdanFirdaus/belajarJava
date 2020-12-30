package CetakData;

public class CetakDataMain {
  public static void main(String[] args) {
    CetakDataTipe data = new CetakDataTipe();

    System.out.print("Cetak Data Tipe String : ");
    data.CetakData("Sumatra");

    System.out.print("Cetak Data Tipe Integer : ");
    data.CetakData(1989);

    System.out.print("Cetak Data Tipe Double : ");
    data.CetakData(16.5 / 2);

    System.out.print("Cetak Data Tipe Char : ");
    data.CetakData('N');
  }
}
