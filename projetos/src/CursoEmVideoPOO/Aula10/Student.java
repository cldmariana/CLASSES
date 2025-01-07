package CursoEmVideoPOO.Aula10;

public class Student extends Person {
    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }

    private int registration;
    private String course;


    public void cancelRegistration() {
        System.out.println("Student registration number " + getRegistration() + " is canceled");
    }


    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
