package ExerciciosLivroC;
import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 4 números: ");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        float num4 = scanner.nextFloat();

        float media = ((num1 + num2 + num3 + num4) / 4);
        String media_format;
        media_format = String.format("%.2f", media);
        System.out.println("A média aritmética é: " + media_format);
    }
}
