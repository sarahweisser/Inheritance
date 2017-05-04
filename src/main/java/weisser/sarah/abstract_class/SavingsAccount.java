package weisser.sarah.abstract_class;

/**
 * Created by sarahweisser on 5/3/17.
 */
public class SavingsAccount extends Account {

    private String userName;
    private double interestRate;
    private double withdrawlFee = 10.00;

    public SavingsAccount() {}

    public SavingsAccount(String userName, double accountBalance, double interestRate) {

        super(accountBalance);
        this.userName = userName;
        this.interestRate = interestRate;
    }

    public double getWithdrawlFee() {
        return withdrawlFee;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public void makeWithdrawl(double withdrawlAmt) {
        super.makeWithdrawl(withdrawlAmt + withdrawlFee);
    }

    @Override
    public String printBalance() {
        String displayBalance = String.format("Account balance for " + userName + " is: $%.2f, and interest rate is: " + interestRate * 100 + " percent.", super.getBalance());
        return displayBalance;
    }

    public double getSimpleInterest() {
        return accountBalance * interestRate;
    }

    public double accrueInterest() {
        accountBalance += getSimpleInterest();
        return accountBalance;
    }
}
