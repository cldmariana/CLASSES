package CursoEmVideoPOO.Aula09;

public class Person {

    private String name;
    private String gender;
    private int age;
    private String dateBirth;


    public Person(String name, String gender, int age, String dateBirth) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.dateBirth = dateBirth;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void status () {
        System.out.println();
        System.out.println("Name: " + this.getName());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Age: " + this.getAge());
        System.out.println("Date of birthday: " + this.getDateBirth());
    }

    public void havaABday() {
        this.age = this.getAge() + 1;
    }
}