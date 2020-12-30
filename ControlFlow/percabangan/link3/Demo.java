package percabangan.link3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("a is : ");
        a = input.nextInt();
        System.out.print("b is :");
        b = input.nextInt();
        if (a > b) {
            System.out.println("a is largest");
        } else {
            System.out.println("b is largest");
        }
    }
}