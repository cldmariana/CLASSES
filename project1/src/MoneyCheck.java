import java.util.Scanner;

public class MoneyCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("A trip to Dsiney costs 3000 dollars");
        System.out.println("How much do you have?");
        float money = scanner.nextFloat();
        

        if (money >= 3000) {
            System.out.println("Nice!! You can go to Disneyland :)");
        } else {
            System.out.println("You cannot go to Disneyland :(");
        }


    }
}

