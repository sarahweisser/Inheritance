package weisser.sarah.abstract_class;

/**
 * Created by sarahweisser on 5/3/17.
 */
public class BusinessAccount extends Account {

    private String businessName;
    private String[] users;

    public BusinessAccount() {}

    public BusinessAccount(double accountBalance, String businessName, String[] users) {

        super(accountBalance);
        this.businessName = businessName;
        this.users = users;

    }

    public String getBusinessName() {
        return businessName;
    }

    public String[] getUsers() {
        return users;
    }

    public boolean checkIfValidUser(String user) {
        boolean validUser = false;
        for(int i = 0; i < users.length; i++) {
            if(user.equals(users[i])) {
                validUser = true;
            }
        }
        return validUser;
    }

    public void makeWithdrawl(double withdrawlAmt, String user) {
        if(checkIfValidUser(user)) {
            super.makeWithdrawl(withdrawlAmt);
        }
        else {
            System.out.println("Invalid user.");
        }
    }

    @Override
    public String printBalance() {
        String displayBalance = String.format("Account balance for " + businessName + " is: $%.2f", super.getBalance());
        return displayBalance;
    }
}
