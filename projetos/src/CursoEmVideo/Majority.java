package CursoEmVideo;

import java.util.Scanner;

public class Majority {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.print("What is your birth year? ");
        int birth_year = scanner.nextInt();
        System.out.print("Which year are we currently? ");
        int current_year = scanner.nextInt();

        age = current_year - birth_year;

        if (age <=18) {
            System.out.println("You have " + age + " years and didn't reached the age of majority.");
        } else {
            System.out.println("You have " + age + " years and already reached the age of majority.");
        }
    }
}
