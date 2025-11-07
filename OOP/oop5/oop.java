package OOP.oop5;

public class oop {
    public static void main(String[] args) {
        Account a = new Account();
        a.setAccountDetalis(101,"Yash",1200);
        a.AccountDetalis();
        a.withdraw(200);
        a.AccountDetalis();
        a.deposit(500);
        a.AccountDetalis();
    }
}
class Account{
    private int accountNo;
    private String custName;
    private int accountBalance;
    private int withdraw;
    private int deposit;

    public void setAccountDetalis(int accountNo, String custName, int accountBalance){
        this.accountNo = accountNo;
        this.custName = custName;
        this.accountBalance = accountBalance;
        this.withdraw = withdraw;
        this.deposit = deposit;
    }
    public void withdraw(int withdraw){
        accountBalance -= withdraw;
    }
    public void deposit(int deposit){
        accountBalance += deposit;
    }

    public void AccountDetalis(){
        System.out.println(accountNo + " " + custName + " " + accountBalance);
    }
}
