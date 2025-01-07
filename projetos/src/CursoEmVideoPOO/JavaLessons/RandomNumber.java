package CursoEmVideoPOO.JavaLessons;

public class RandomNumber {
    public static void randomNumbers() {

        java.util.Random random = new java.util.Random();

        //+1 para começar a partir do numero 1 e nao do 0
        int a = random.nextInt(10)+1;
        //double b = random.nextDouble(5)+1;
        //boolean c = random.nextBoolean();

        System.out.println(a);
    }
}

//        Classes.RandomNumber.randomNumbers();
