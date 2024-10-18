package CursoEmVideo;

import java.util.Scanner;

public class AverageGrade {

    public static void main(String[] args) {

        float media;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the first grade: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Now, the second grade: ");
        float nota2 = scanner.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.println("Your average grade is " + media);
    }
}
