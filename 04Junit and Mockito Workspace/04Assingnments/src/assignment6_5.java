import java.util.Scanner;
 
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
 
class Account {
    private double balance;
 
    public Account(double balance) {
        this.balance = balance;
    }
 
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("INSUFFICIENT BALANCE! Available balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}
 
public class assignment6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        Account account = new Account(initialBalance);
 
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
 
        try {
            account.withdraw(withdrawAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
 
        scanner.close();
    }
}