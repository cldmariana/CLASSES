package CursoEmVideoPOO.Aula05;

import java.util.Objects;

public class ContaBanco {

    public int accountNum;
    protected String accountType;
    private float balance = 0;
    private boolean accountStatus;
    private String user;
    private float deposit;
    private float withdraw;


    public ContaBanco() {
        this.setBalance(0);
        this.setAccountStatus(false);
    }

    public void currentStatus() {
        System.out.println();
        System.out.println("Account Status: " + getAccountStatus());
        System.out.println("User: " + getUser());
        System.out.println("Account: " + getAccountNum());
        System.out.println("Type: " + getAccountType());
        System.out.println("Balance: " + getBalance());
    }


    public void openAccount(String accountType) {
        setAccountType(accountType);
        setAccountStatus(true);
        if (Objects.equals(accountType, "Current Account")) {
            this.setBalance(50);
            System.out.println("Current account opened!");
        } else if (Objects.equals(accountType, "Saving Account")) {
            this.setBalance(150);
            System.out.println("Saving account opened!");
        }
    }

    public void closeAccount() {
        if (this.getBalance() > 0) {
            System.out.println("Is not possible to close the account. You have money in it.");
        } else if (this.getBalance() < 0) {
            System.out.println("Is not possible to close the account. You have a negative balance.");
        } else {
            this.setAccountStatus(false);
            System.out.println("Account closed");
        }
    }

    public void deposit(float deposit) {
        if (this.getAccountStatus()) {
            this.setBalance(this.getBalance() + deposit);
            System.out.println("Deposit made successfully in " + this.getUser() + "'s account. New balance: " + this.getBalance());
        } else {
            System.out.println("You can't deposit");
        }
    }

    public void withdraw(float withdraw) {
        if (this.accountStatus) {
            if (this.getBalance() >= withdraw) {
                this.setBalance(this.getBalance() - withdraw);
                System.out.println("Withdrawal made successfully. New balance: " + this.getBalance());
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("You can't withdraw from a closed account.");
        }
    }

    public void payMonthly() {
        int monthPay = 0;
        if (Objects.equals(this.getAccountType(), "Current Account")) {
            monthPay = 12;
        } else if (Objects.equals(this.getAccountType(), "Saving Account")) {
            monthPay = 20;
        }
        if (this.getAccountStatus()) {
            if (monthPay <= this.getBalance()) {
                this.setBalance(this.getBalance() - monthPay);
                System.out.println("Monthly payment made successfully. Your new balance is U$" + this.getBalance());
            } else if (this.getBalance() < monthPay) {
                System.out.println("Insufficient balance");
            } else {
                System.out.println("You can't pay a closed account");
            }
        }
    }

//    if (this.accountStatus) {
//        if (balance > monthPay && Objects.equals(accountType, "CA")) {
//            this.monthPay = 12;
//            setBalance(getBalance() - monthPay);
//            System.out.println("Monthly payment made successfully. Your new balance is U$" + getBalance());
//        } else if (balance > monthPay && Objects.equals(accountType, "SA")) {
//            this.monthPay = 20;
//            setBalance(getBalance() - monthPay);
//            System.out.println("Monthly payment made successfully. Your new balance is U$" + getBalance());
//        } else {
//            System.out.println("Insufficient balance");
//        }
//    }

    public void setAccountNum(int numConta) {
        this.accountNum = numConta;
    }

    public int getAccountNum() {
        return this.accountNum;
    }

    public void setAccountType(String accountType) {

        this.accountType = accountType;
    }

    public String getAccountType() {

        return accountType;
    }

    public void setBalance(float balance) {

        this.balance = balance;
    }

    public float getBalance() {

        return balance;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public boolean getAccountStatus() {
        return accountStatus;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return this.user;
    }
}


