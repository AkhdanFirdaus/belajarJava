import java.util.Scanner;

public class GajiKotor {
    public static void main(String[] args) {
        double gajiBersih, gajiKotor, potongan, pajak = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.print("Input gaji bersih\t= ");
        gajiKotor = input.nextDouble();

        potongan = pajak * gajiKotor;
        gajiBersih = gajiKotor - potongan;

        System.out.println("Potongan\t\t= " + potongan);
        System.out.println("Gaji bersih\t\t= " + gajiBersih);

        input.close();
    }
}