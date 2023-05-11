public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500, "Anon"); //Bank Account part 1
        BankAccount account2 = new BankAccount(5000, "Larry"); //BankAccount part II transfer
        BankAccount account3 = new BankAccount(300,"Mary"); //BankAccount part II transfer
        account1.deposit(100); //Bank Account part 1
        account1.getAccountDetails();//Bank Account part 1

        account2.withdrawal(100);//BankAccount part II transfer
        account3.deposit(100); //BankAccount part II transfer
        account2.getAccountDetails(); //BankAccount part II transfer
        account3.getAccountDetails(); //BankAccount part II transfer
    }
}
