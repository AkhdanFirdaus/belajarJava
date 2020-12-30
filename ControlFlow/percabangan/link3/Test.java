package percabangan.link3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("b is : ");
        b = input.nextInt();
        System.out.print("c is : ");
        c = input.nextInt();
        if (b > c) {
            System.out.println("b is greater than c");
        }
        System.out.println("example for the comparison of two numbers");
        input.close();
    }
}