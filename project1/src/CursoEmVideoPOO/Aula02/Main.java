package CursoEmVideoPOO.Aula02;

public class Main {
    public static void main(String[] args) {

        Pen c1 = new Pen("BIC CRISTAL", 0.5f, 100, false);
        c1.setModel("BIC CRISTAL");
        c1.setTip(0.5f);
        c1.setCharge(100);

        System.out.println("The model of the pen is " + c1.getModel() + ", tip " + c1.getTip() + " and charge of " + c1.getCharge());
        System.out.println();
        c1.statusPen();
        c1.scribble();
        System.out.println(c1.getModel() + ", " + c1.getTip());
    }
}
