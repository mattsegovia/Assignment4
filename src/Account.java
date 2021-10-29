public class Account {
    private AccountHolder holder;
    private double balance = 0.0;

    public Account(double amt, AccountHolder holder) {
        this.holder = holder;
        this.balance = amt;
    }

    public double deposit(double amt) {
        return amt;
    }

    public double withdraw(double amt) {
        return amt;
    }

    public double getBalance() {
        return this.balance;
    }

    public AccountHolder getHolder() {
        return this.holder;
    }

    public void setBalance(double amt) {
        this.balance = amt;
    }

    public void setHolder(AccountHolder holder) {
        this.holder = holder;
    }
}
