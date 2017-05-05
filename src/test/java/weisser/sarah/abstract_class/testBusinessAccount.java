package weisser.sarah.abstract_class;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/5/17.
 */
public class TestBusinessAccount {

    @Test
    public void testBusinessAccount() {

        //given
        String[] users = {"Sarah", "Joe", "TacoByter"};
        BusinessAccount account = new BusinessAccount(50.00, "Sarah's LLC.", users);
        String expectedResult = "Sarah's LLC.";

        //when
        String actualResult = account.getBusinessName();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testGetUsers() {

        //given
        String[] users = {"Sarah", "Joe", "TacoByter"};
        BusinessAccount account = new BusinessAccount(50.00, "Sarah's LLC.", users);
        String[] expectedResult = {"Sarah", "Joe", "TacoByter"};

        //when
        String[] actualResult = account.getUsers();

        //then
        Assert.assertEquals(expectedResult[0], actualResult[0]);

    }

    @Test
    public void testCheckValidUser() {

        //given
        String[] users = {"Sarah", "Joe", "TacoByter"};
        BusinessAccount account = new BusinessAccount(50.00, "Sarah's LLC.", users);
        boolean expectedResult = true;

        //when
        boolean actualResult = account.checkIfValidUser("TacoByter");

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCheckInvalidUser() {

        //given
        String[] users = {"Sarah", "Joe", "TacoByter"};
        BusinessAccount account = new BusinessAccount(50.00, "Sarah's LLC.", users);
        boolean expectedResult = false;

        //when
        boolean actualResult = account.checkIfValidUser("Purple Bipin");

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testBusinessWithdrawlValidUser() {

        //given
        String[] users = {"Sarah", "Joe", "TacoByter"};
        BusinessAccount account = new BusinessAccount(50.00, "Sarah's LLC.", users);
        account.makeWithdrawl(25.00, "TacoByter");
        double expectedResult = 25.00;

        //when
        double actualResult = account.getBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testBusinessWithdrawlInvalidUser() {

        //given
        String[] users = {"Sarah", "Joe", "TacoByter"};
        BusinessAccount account = new BusinessAccount(50.00, "Sarah's LLC.", users);
        account.makeWithdrawl(25.00, "Purple Bipin");
        double expectedResult = 50.00;

        //when
        double actualResult = account.getBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testBusinessWithdrawlInsufficientFunds() {

        //given
        String[] users = {"Sarah", "Joe", "TacoByter"};
        BusinessAccount account = new BusinessAccount(50.00, "Sarah's LLC.", users);
        account.makeWithdrawl(55.00, "TacoByter");
        double expectedResult = 50.00;

        //when
        double actualResult = account.getBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testBusinessPrintBalance() {

        //given
        String[] users = {"Sarah", "Joe", "TacoByter"};
        BusinessAccount account = new BusinessAccount(50.00, "Sarah's LLC.", users);
        account.makeWithdrawl(5.00, "TacoByter");
        String expectedResult = "Account balance for Sarah's LLC. is: $45.00";

        //when
        String actualResult = account.printBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }
}
