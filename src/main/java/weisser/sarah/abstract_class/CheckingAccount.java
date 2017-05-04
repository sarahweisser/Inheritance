package weisser.sarah.abstract_class;

/**
 * Created by sarahweisser on 5/3/17.
 */
public class CheckingAccount extends Account {

    private String userName;
    private double minimumBalance = 50.00;


    public CheckingAccount(String userName, double accountBalance) {
        super(accountBalance);
        this.userName = userName;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String printBalance() {
        String displayBalance = String.format("Account balance for " + userName + " is: $%.2f", super.getBalance());
        return displayBalance;
    }

    @Override
    public void makeWithdrawl(double withdrawlAmt) {
        super.makeWithdrawl(accountBalance - minimumBalance);
    }

    public String orderChecks() {
        String orderChecks = "Checks will be sent to " + userName;
        return orderChecks;
    }

}
