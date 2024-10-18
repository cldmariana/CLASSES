package ExerciciosLivroC;

import java.util.Scanner;

public class BemVindo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        String name = scanner.next();
        System.out.println("Bem vindo (a), " + name + "!");

    }
}
