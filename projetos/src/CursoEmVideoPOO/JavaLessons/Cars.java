package CursoEmVideoPOO.JavaLessons;

public class Cars {
    String color = "Black";
    String model = "Uno quadrado";
    String mark = "Fiat";
    boolean turbo = true;
    int year = 1997;
    double price = 12999.99;
    boolean turnLeft = true;
    boolean accelerate_ = false;

    public void status() {
        System.out.print("Mark of the car: ");
        System.out.println(this.mark);
        System.out.print("Model of the car: ");
        System.out.println(this.model);
        System.out.print("Year of the car: ");
        System.out.println(this.year);
        System.out.print("Color of the car: ");
        System.out.println(this.color);
        System.out.print("Price of the car: ");
        System.out.println(this.price);
        System.out.println();
    }
    public void turbinado() {
        if (this.turbo) {
            System.out.println("The car has turbo");
        } else {
            System.out.println("The car doesn't has turbo");
        }
    }

    protected void turn() {
        if (this.turnLeft == true) {
            System.out.println("You turned left");
        } else {
            System.out.println("You turned right");
        }

    }

    protected void accelerate() {
        if (this.accelerate_) {
            System.out.println("You accelerate the car");
        } else {
            System.out.println("You don't accelerate the car");
        }
    }

    public void brake() {
        if (!this.accelerate_) {
            System.out.println("You braked the car");

        } else {
            System.out.println("You can't brake the car");
        }
    }
}

//        Classes.Cars car = new Classes.Cars();
//
//
//        car.status();
//        car.turbinado();
//        car.brake();
//        car.turn();
//        car.accelerate();

