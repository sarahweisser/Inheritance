package weisser.sarah.abstract_class;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/3/17.
 */
public class TestCheckingAccount {

    @Test
    public void testGetCheckingBalance() {

        //given
        CheckingAccount account = new CheckingAccount("Sarah", 50.00);
        double expectedResult = 50.00;

        //when
        double actualResult = account.getBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testGetCheckingMinimumBalance() {

        //given
        CheckingAccount account = new CheckingAccount("Sarah", 50.00);
        double expectedResult = 50.00;

        //when
        double actualResult = account.getMinimumBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void testGetCheckingUserName() {

        //given
        CheckingAccount account = new CheckingAccount("Sarah", 50.00);
        String expectedResult = "Sarah";

        //when
        String actualResult = account.getUserName();

        //then
        Assert.assertEquals(expectedResult, actualResult);
        
    }

    @Test
    public void testMakeCheckingDeposit() {

        //given
        CheckingAccount account = new CheckingAccount("Sarah", 50.00);
        account.makeDeposit(30.00);
        double expectedResult = 80.00;

        //when
        double actualResult = account.getBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testPrintCheckingBalance() {

        //given
        CheckingAccount account = new CheckingAccount("Sarah", 50.00);
        account.makeDeposit(30.00);
        String expectedResult = "Account balance for Sarah is: $80.00";

        //when
        String actualResult = account.printBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCheckingWithdrawlSufficientFunds() {

        //given
        CheckingAccount account = new CheckingAccount("Sarah", 75.00);
        account.makeWithdrawl(25.00);
        double expectedResult = 50.00;

        //when
        double actualResult = account.getBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testCheckingWithdrawlInsuficientFunds() {

        //given
        CheckingAccount account = new CheckingAccount("Sarah", 50.00);
        account.makeWithdrawl(75.00);
        double expectedResult = 50.00;

        //when
        double actualResult = account.getBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testCheckingWithdrawlBelowMinimumBalance() {
        //given
        CheckingAccount account = new CheckingAccount("Sarah", 50.00);
        account.makeWithdrawl(25.00);
        double expectedResult = 50.00;

        //when
        double actualResult = account.getBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testOrderChecks() {

        //given
        CheckingAccount account = new CheckingAccount("Sarah", 50.00);
        String expectedResult = "Checks will be sent to Sarah";

        //when
        String actualResult = account.orderChecks();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

}
