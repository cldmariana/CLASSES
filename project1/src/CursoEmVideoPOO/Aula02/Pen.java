package CursoEmVideoPOO.Aula02;

public class Pen {

    public String model;
    public String color = "Blue";
    private float tip;
    protected int charge;
    protected boolean covered;


    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getTip() {
        return this.tip;
    }

    public void setTip(float p) {
        this.tip = p;
    }

    public int getCharge() {
        return this.charge;
    }

    public void setCharge(int c) {
        this.charge = c;
    }


    //constructor:
    public Pen(String model, float tip, int charge, boolean covered) {
        this.model = model;
        this.tip = tip;
        this.charge = charge;
        this.covered = covered;
    }


    public void statusPen() {
        System.out.println();
        System.out.println("Pen model: " + this.model);
        System.out.println("Pen color: " + this.color);
        System.out.println("Pen tip: " + this.tip);
        System.out.println("Pen charge: " + this.charge);
        System.out.println("Is it covered? " + this.covered);
        System.out.println();
    }

    public void scribble() {
        if (!covered) {
            System.out.println("I can scribble!");
        } else {
            System.out.println("I cannot scribble :(");
        }
    }
    //scribble = rabiscar

    protected void cover() {
        this.covered = true;
    }

    protected void uncover() {
        this.covered = false;
    }

}

