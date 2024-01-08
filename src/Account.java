public class Account {
    private String accountNumber;
    private double balance;

    // Конструктор класса
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Метод для пополнения счета
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение на " + amount + " успешно. Новый баланс: " + balance);
        } else {
            System.out.println("Ошибка: сумма для пополнения должна быть положительной.");
        }
    }

    // Метод для снятия средств
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Снятие " + amount + " успешно. Новый баланс: " + balance);
            } else {
                System.out.println("Ошибка: недостаточно средств на счете.");
            }
        } else {
            System.out.println("Ошибка: сумма для снятия должна быть положительной.");
        }
    }

    // Метод для получения текущего баланса
    public double getBalance() {
        return balance;
    }

    // Метод для получения номера счета
    public String getAccountNumber() {
        return accountNumber;
    }

}
