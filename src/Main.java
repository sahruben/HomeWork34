public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account("987654321", 1000.0);

        System.out.println("Номер счета: " + myAccount.getAccountNumber());
        System.out.println("Текущий баланс: " + myAccount.getBalance());

        myAccount.deposit(450.0);
        myAccount.withdraw(150.0);
        myAccount.withdraw(1350.0);
    }
}
