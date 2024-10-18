package CursoEmVideo;

import java.util.Scanner;

public class Donation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("[1] to donate $10");
        System.out.println("[2] to donate $25");
        System.out.println("[3] to donate $50");
        System.out.println("[4] to donate a custom value");
        System.out.println("[5] to cancel");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You donated $10");
                break;
            case 2:
                System.out.println("You donated $25");
                break;
            case 3:
                System.out.println("You donated $50");
                break;
            case 4:
                System.out.println("Enter the donation value: ");
                int donation = scanner.nextInt();
                System.out.println("You donated $" + donation);
                break;
            case 5:
                System.out.println("You have cancelled the donation.");
                break;
        }
    }
}
