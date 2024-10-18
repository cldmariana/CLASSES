package ExerciciosLivroC;

import java.util.Scanner;

public class AntecessorSucessor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para saber seu sucessor e antecessor: ");
        int num = scanner.nextInt();

        int ant;
        int suc;

        ant = num - 1;
        suc = num + 1;

        System.out.println("O antecessor de " + num + " é " + ant + " e o sucessor é " + suc + ".");

    }
}
