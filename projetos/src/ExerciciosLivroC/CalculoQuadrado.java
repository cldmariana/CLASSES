package ExerciciosLivroC;
import java.util.Scanner;
import java.lang.Math;

public class CalculoQuadrado {

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um número para calcular seu quadrado: ");
        int num  = scanner.nextInt();
        num = (int) Math.pow(num, 2);
        //int resultado = (int) Math.sqrt(num);
        System.out.println("O resultado é: " + num);

    }
}
