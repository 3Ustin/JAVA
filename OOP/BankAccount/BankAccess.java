public class BankAccess {
    public static void main(String[] args){
        BankAccount bank = new BankAccount();
        System.out.println(BankAccount.totalAccMade);
        bank.deposit(0, 1000.00);
        bank.withdraw(1, 200.00);
        System.out.println(bank.accountBal());
    }
}
