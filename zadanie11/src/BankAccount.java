public class BankAccount implements AccountOperations{
private double accountValue =0;

    public BankAccount(Client c, double accountValue) {
        this.accountValue = accountValue;
    }

    @Override
    public void showAccountValue() {
        System.out.println(this.accountValue);
    }

    @Override
    public void transfer(double transferValue, BankAccount a) {
        this.accountValue = this.accountValue - transferValue;
        a.accountValue = a.accountValue + transferValue;
    }

    @Override
    public void addToAccount(double value) {
        this.accountValue += value;
        System.out.println("Twoj stan konta to: "+ this.accountValue);
    }
}
