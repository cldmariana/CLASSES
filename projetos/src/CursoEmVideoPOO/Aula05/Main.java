package CursoEmVideoPOO.Aula05;

public class Main {
    public static void main(String[] args) {

        ContaBanco account1 = new ContaBanco();
        ContaBanco account2 = new ContaBanco();


        account1.setUser("Mariana");
        account1.setAccountNum(92634);
        account1.openAccount("Current Account");
        //account1.deposit(200);
        //account1.monthlyPayment();
        //account1.currentStatus();

//        account2.setUser("Tiago");
//        account2.setAccountNum(84632);
//        account2.openAccount("Saving Account");
//        account2.withdraw(75.5f);
//        account2.monthlyPayment();
//        account2.currentStatus();
    }
}
