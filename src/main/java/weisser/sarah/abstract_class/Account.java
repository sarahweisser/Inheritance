package weisser.sarah.abstract_class;

/**
 * Created by sarahweisser on 5/3/17.
 */
public abstract class Account {

    protected double accountBalance;

    public Account() {}

    public Account(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void makeDeposit(double depositAmt){
        accountBalance += depositAmt;
    }

    public void makeWithdrawl(double withdrawlAmt) {
        if(accountBalance >= withdrawlAmt) {
            accountBalance -= withdrawlAmt;
        }
        else {
            printInsufficientFunds();
        }
    }

    public String printInsufficientFunds() {
        return "Insufficient Funds.";
    }

    public abstract String printBalance();

}
