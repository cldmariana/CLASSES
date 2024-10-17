import java.util.Scanner;

//
// UNFINISHED
//

public class Pyramid {

    int h;
    //altura
    int l;
    //aresta da base
    static int m;
    //apótema da base
    static float g;
    //apótema da pirâmide
    static float a;
    //aresta lateral
    static float volume;
    //volume
    static float Ab;
    //área da base
    static float Al;
    //área lateral
    static float At;
    //área total


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Altura: ");
        int h = scanner.nextInt();
        System.out.print("Aresta da base: ");
        int l = scanner.nextInt();


        m = l / 2;
        System.out.println("Apótema da base: " + m + " cm.");


        g = (float) Math.pow(m, 2 + (Math.pow(h, 2)));
        System.out.println("Apótema da pirâmide: " + g + " cm.");
        String apotema_piramide;
        apotema_piramide = String.format("%.2f", g);
        System.out.println("Apótema da pirâmide: " + apotema_piramide + " cm.");


        a = (float) Math.pow(g, 2 + (Math.pow((Math.pow(l, 2)), 2)));
        String aresta_lateral;
        aresta_lateral = String.format("%.2f", a);
        System.out.println("Aresta lateral: " + aresta_lateral + " cm.");


        Ab = (float) Math.pow(l, 2);
        volume = (Ab * h) / 3;
        String volume1;
        volume1 = String.format("%.2f", volume);
        System.out.println("Volume: " + volume1 + " cm3.");


        Al = ((l * g / 2) * 4);
        At = Ab + Al;
        System.out.println("Área total: " + At + " cm2.");

//        g = (float) sqrt(m^2 + h^2);
//        System.out.print("Apótema da pirâmide: " + g + " cm.");
//
//        a = sqrt(g^2 + ((l/2)^2));
    }
}