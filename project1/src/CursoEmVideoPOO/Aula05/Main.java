package CursoEmVideoPOO.Aula05;

public class Main {
    public static void main(String[] args) {

        ContaBanco account1 = new ContaBanco();
        ContaBanco account2 = new ContaBanco();


        account1.setUser("Mariana");
        account1.setAccountNum(92634);
        account1.openAccount("Current Account");
        account1.currentStatus();
        account1.deposit(500);

        account2.setUser("Maick");
        account2.setAccountNum(84632);
        account2.openAccount("Saving Account");
        account2.currentStatus();
    }
}
