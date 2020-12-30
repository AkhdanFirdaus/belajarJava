public class Record {

  public static void main(String[] args) {
    Tanggal t1 = new Tanggal();

    t1.hari = 21;
    t1.bulan = 10;
    t1.tahun = 2013;

    Tanggal t2 = new Tanggal();
    t2.hari = 7;
    t2.bulan = 5;
    t2.tahun = 2016;

    System.out.println("waktu sebelumnya : " + t1.hari + "-" + t1.bulan + "-" + t1.tahun);
    System.out.println("waktu sebelumnya : " + t2.hari + "-" + t2.bulan + "-" + t2.tahun);
  }
}

class Tanggal {
  int hari, bulan, tahun;
}
