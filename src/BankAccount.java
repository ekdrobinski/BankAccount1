public class BankAccount {
    private double bankAccountBalance; //Attribute
    private String accountHolderName;  //Attribute
    public BankAccount(double bankAccountBalance, String accountHolderName) {
        this.bankAccountBalance = bankAccountBalance;  //this references the BankAccount class
        this.accountHolderName = accountHolderName;
    }
    public void deposit (double amountToDeposit) {
        bankAccountBalance = bankAccountBalance + amountToDeposit;
    }
    public void withdrawal (double amountToWithdraw) {
        bankAccountBalance = bankAccountBalance - amountToWithdraw;
    }
    public void getAccountDetails () {
        System.out.println(accountHolderName + "'s account balance:  " + bankAccountBalance);
    }
}
