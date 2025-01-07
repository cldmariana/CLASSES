package CursoEmVideoPOO.JavaLessons;

public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){

        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void sleep() {
        System.out.println(this.name+" is sleeping");
    }
    void playsVolleyball() {
        System.out.println(this.name+" is playing volleyball");
    }

}

//        Classes.Human human1 = new Classes.Human("Rick",65,70);
//        Classes.Human human2 = new Classes.Human("Morty",16,50);
//
//        human1.sleep();
//        human2.playsVolleyball();
//
//        System.out.println("His name is " + human1.name + " and he's " + human1.age + " years old");
//        System.out.println("His weight is " + human1.weight);
