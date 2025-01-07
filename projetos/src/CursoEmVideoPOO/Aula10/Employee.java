package CursoEmVideoPOO.Aula10;

public class Employee extends Person {
    public Employee(String name, int age, String gender) {
        super(name, age, gender);
    }

    private String section;
    private boolean working;


    public void changeWorking() {
        this.working = !this.working;
        //this.working recebe o inverso de this.working
    }


    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void isWorking() {
        System.out.println(getName() + " is working");
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}
