public class CicilanHaji {
    public static void main(String[] args) {
        int target = 50000000, tabungan = 20000000, setoran = 10000000, jmlCicilan = 24;
        double cicilan;

        System.out.println("Uang pak Soleh = " + tabungan);
        System.out.println("Biaya naik haji= " + target);
        System.out.println("Setoran Awal   = " + setoran);

        tabungan -= setoran;
        target -= setoran;
        cicilan = target / jmlCicilan;

        System.out.println("Sisa uang tabungan pak sholeh di rumah = " + tabungan);
        System.out.println("Sisa uang yang harus di bayarkan = " + target);
        System.out.println("Cicilan per " + jmlCicilan + " bulan = " + cicilan);
    }
}