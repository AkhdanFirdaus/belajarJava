package percabangan.link5;

import java.util.Scanner;

public class Hadiah {
    public static void main(String[] args) {
        int belanja = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Total Belanjaan: Rp. ");
        belanja = input.nextInt();

        if (belanja > 100000) {
            System.out.println("Selamat, anda mendapatkan hadiah!");
        }

        System.out.println("Terima kasih...");
        input.close();
    }
}