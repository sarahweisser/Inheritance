package weisser.sarah.abstract_class;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sarahweisser on 5/3/17.
 */
public class TestSavingsAccount {

    @Test
    public void testGetSavingsBalance() {

        //given
        SavingsAccount account = new SavingsAccount("Sarah", 50.00, .05);
        double expectedResult = 50.00;

        //when
        double actualResult = account.getBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testGetSavingsWithdrawlFee() {

        //given
        SavingsAccount account = new SavingsAccount("Sarah", 50.00, .05);
        double expectedResult = 10.00;

        //when
        double actualResult = account.getWithdrawlFee();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testGetSavingsUserName() {

        //given
        SavingsAccount account = new SavingsAccount("Sarah", 50.00, .05);
        String expectedResult = "Sarah";

        //when
        String actualResult = account.getUserName();

        //then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetSavingsInterestRate() {

        //given
        SavingsAccount account = new SavingsAccount("Sarah", 50.00, .05);
        double expectedResult = .05;

        //when
        double actualResult = account.getInterestRate();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testMakeSavingsDeposit() {

        //given
        SavingsAccount account = new SavingsAccount("Sarah", 50.00, .05);
        account.makeDeposit(25.00);
        double expectedResult = 75.00;

        //when
        double actualResult = account.getBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testPrintSavingsBalance() {

        //given
        SavingsAccount account = new SavingsAccount("Sarah", 50.00, .05);
        account.makeDeposit(25.00);
        String expectedResult = "Account balance for Sarah is: $75.00, and interest rate is: 5.0 percent.";

        //when
        String actualResult = account.printBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testSavingsWithdrawlSufficientFunds() {

        //given
        SavingsAccount account = new SavingsAccount("Sarah", 50.00, .05);
        account.makeWithdrawl(25.00);
        double expectedResult = 15.00;

        //when
        double actualResult = account.getBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testSavingsWithdrawlInsufficientFunds() {

        //given
        SavingsAccount account = new SavingsAccount("Sarah", 50.00, .05);
        account.makeWithdrawl(50.00);
        double expectedResult = 50.00;

        //when
        double actualResult = account.getBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void testSavingsAccrueInterest() {

        //given
        SavingsAccount account = new SavingsAccount("Sarah", 50.00, .05);
        account.accrueInterest();
        double expectedResult = 52.50;

        //when
        double actualResult = account.getBalance();

        //then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

}
