import java.util.Scanner;

public class Faktorisasi {
    public static int faktor(int bilangan) {
        int i, total = 1;
        for (i = 1; i <= bilangan; i++) {
            total *= i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bilangan;

        System.out.print("Masukkan bilangan faktor = ");
        bilangan = scan.nextInt();
        System.out.println("Faktorisasi dari " + bilangan + " adalah " + faktor(bilangan));
        scan.close();
    }
}