import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        int x, y, r;
        double z;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x : ");
        x = input.nextInt();
        System.out.print("Enter y : ");
        y = input.nextInt();
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");
        System.out.println("Requirement : ");
        r = input.nextInt();
        switch (r) {
            case 1:
                z = x + y;
                break;
            case 2:
                z = x - y;
                System.out.println(z);
                break;
            case 3:
                z = x * y;
                System.out.println(z);
                break;
            case 4:
                z = x / y;
                System.out.println(z);
                break;
            default:
                System.out.println("Requirement is invalid");
                break;
        }
        input.close();
    }
}