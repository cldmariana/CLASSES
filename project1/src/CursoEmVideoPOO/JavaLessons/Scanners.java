package CursoEmVideoPOO.JavaLessons;

import java.util.Scanner;
public class Scanners {
    public static void scanners() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("How is  your favorite sport?");
        String sport = scanner.nextLine();

        System.out.println("Hello " + name + ", you have " + age + " years old");
        System.out.println("Nice! You like " + sport);
    }

}

//        Classes.Scanners.scanners();

