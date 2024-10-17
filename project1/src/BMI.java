import java.util.Scanner;

public class BMI {

    public static float getSquare(float height) {
        return height * height;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Height: ");
        float height = scanner.nextFloat();
        System.out.print("Weight: ");
        float weight = scanner.nextInt();

        float bmi;

        bmi = weight / getSquare(height);

        System.out.print("Your body mass index is: " + bmi);

    }
}
