public class BankAccount {
    private static int totalAccounts = 0;
    private int accountNumber;
    private double balance;
    private static int nextAccountNumber = 1;


    public BankAccount(double initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.balance = initialBalance;
        totalAccounts++; // increment total accounts each time a new account is created
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }


    public double getBalance() {
        return balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}

