public class BankAccount {
     String name;
     int accountId;
     double balance;

    public BankAccount(String name, int accountId, double balance) {
        this.name = name;
        this.accountId = accountId;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account ID: " + accountId);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Sakhawat Hossain", 22201077, 1000.0);
        BankAccount account2 = new BankAccount("Rakib Hasan", 22201096, 2000.0);

        // Deposit into account1
        account1.deposit(500.0);

        // Withdraw from account2
        account2.withdraw(300.0);

        // Display information of both accounts
        System.out.println("Account 1 details:");
        account1.display();
        System.out.println();

        System.out.println("Account 2 details:");
        account2.display();
    }
}
