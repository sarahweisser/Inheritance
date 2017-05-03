package weisser.sarah.abstract_class;

/**
 * Created by sarahweisser on 5/3/17.
 */
public abstract class Account {

    protected double accountBalance;
    protected double minimumBalance;

    public abstract double getBalance();

    public abstract void makeDeposit();

    public abstract void makeWithdrawl();

}
