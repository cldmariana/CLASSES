package CursoEmVideoPOO.Aula09;

public class Main {
    public static void main(String[] args) {

        Person[] person = new Person[2];
        person[0] = new Person("Mariana", "Woman", 18, "15/11/2005");
        person[1] = new Person("Julia", "Woman", 25, "05/08/1998");

        person[0].status();
        person[1].status();


        Book[] book = new Book[2];
        book[0] = new Book("Algoritmos", "Nita Kaine", 430, true, 0, person[0]);
        book[1] = new Book("Justino, o lenhador", "Rafael Guslo", 245, false, 42, person[1]);

        book[0].leafThrough(134);
        book[1].leafThrough(44);
        book[1].previousPage();
        System.out.println(book[0].bookDetails());
        System.out.println(book[1].bookDetails());
    }
}