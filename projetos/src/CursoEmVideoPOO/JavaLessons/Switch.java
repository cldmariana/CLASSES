package CursoEmVideoPOO.JavaLessons;

public class Switch {
    public static void switchs() {

        String number = "3";

        switch (number) {
            case "1": System.out.println("Is not 5");
            break;
            case "2": System.out.println("Is not 5");
            break;
            case "3": System.out.println("Is not 5");
            break;
            case "4": System.out.println("Is not 5");
            break;
            case "5": System.out.println("Is it 5!");
            break;
            //default -> se nao for nenhum dos numeros acima/relacionados
            default:
                System.out.println("It is not a number/It is not 5");
        }
    }
}

//        Classes.Switch.switchs();
