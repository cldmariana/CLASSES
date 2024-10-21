package CursoEmVideoPOO.Aula02;

public class Main {
    public static void main(String[] args) {

        Pen c1 = new Pen("BIC CRISTAL", "RED", 0.7f, 3, false);

//        c1.setModel("BIC CRISTAL");
//        c1.setColor("BLUE");
//        c1.setTip(0.5f);
//        c1.setCharge(100);

        //System.out.println("The model of the pen is " + c1.getModel() + ", tip " + c1.getTip() + " and charge of " + c1.getCharge());
        //System.out.println();
        c1.statusPen();
        c1.scribble();
        System.out.println(c1.getModel() + ", " + c1.getTip());

        Pen c2 = new Pen("BOSS", "BLACK", 0.4f, 5.1f, false);
        c2.statusPen();
        c2.scribble();
    }
}
