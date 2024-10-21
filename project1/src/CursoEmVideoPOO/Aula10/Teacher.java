package CursoEmVideoPOO.Aula10;

public class Teacher extends Person {
    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
    }

    private String specialty;
    private float salary;


    public void receiveRaise(float raise) {
        this.salary += raise;
        System.out.println("The new salary of the teacher is U$" + getSalary());
        //setSalary(getSalary() + raise);
    }


    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
