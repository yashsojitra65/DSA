package OOP;

public class oop4 {
    public static void main(String[] args) {
        Account a = new Account();
        a.setDetails(101,"Yash",10000,4.5);
        a.AccountDetails();
    }
}
class Account{
    private int accountNumber;
    private String custName;
    private int balance;
    private double InterestRate;

    private double Interest;

    public void setDetails(int accountNumber, String custName, int balance, double interestRate){
        this.accountNumber = accountNumber;
        this.custName = custName;
        this.balance = balance;
        this.InterestRate = interestRate;
        calculateInterest();
        TotalBalance();
    }

    public int TotalBalance(){
        balance += Interest;
        return balance;
    }
    public void calculateInterest(){
        Interest = balance * InterestRate / 100;
    };
    public void AccountDetails(){
        System.out.println(accountNumber +" "+custName + " " + InterestRate + " " + balance + " " + Interest);
    }
}
