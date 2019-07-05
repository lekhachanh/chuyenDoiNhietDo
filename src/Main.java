import java.util.Scanner;

public class Main {
    public static double cToF(double C) {
        double F = (9.0 / 5) * C + 32;
        return F;
    }

    public static double FToC(double F) {
        double C = (5.0 / 9) * (F - 32);
        return C;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C;
        double F;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Do F sang Do C");
            System.out.println("2. Do C sang Do F");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter F");
                    F = input.nextDouble();
                    System.out.println("do F sang do C: " + FToC(F));

                    break;
                case 2:
                    System.out.println("enter C");
                    C = input.nextDouble();
                    System.out.println("do C sang do F: " + cToF(C));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
