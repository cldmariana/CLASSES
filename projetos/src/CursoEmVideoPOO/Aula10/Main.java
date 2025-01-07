package CursoEmVideoPOO.Aula10;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Mariana", 18, "Female");
        Student student1 = new Student("Tiago", 13, "Male");
        Teacher teacher1 = new Teacher("Joana", 53, "Female");
        Employee employee1 = new Employee("Cesar", 35, "Male");

        System.out.println(person1.toString());
        System.out.println();
        student1.setRegistration(898234);
        student1.cancelRegistration();
        teacher1.setSalary(2400f);
        teacher1.receiveRaise(252.25f);
        employee1.isWorking();
        System.out.println(student1.toString());
        System.out.println();
        System.out.println(teacher1.toString());
        System.out.println();
        System.out.println(employee1.toString());
        System.out.println();
    }
}
