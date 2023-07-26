package Tests;

import Pages.OrderCompletedPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Tests.LoginPageTest.driver;

public class OrderCompletedPageTest {
    @BeforeMethod
    public void setUp(){
        CheckOutOverviewPageTest checkOutOverviewPageTest = new CheckOutOverviewPageTest();
        checkOutOverviewPageTest.setUp();
        checkOutOverviewPageTest.totalAssertion();
    }
    @Test
    public void confirmationMessageTest(){
        Assert.assertTrue(OrderCompletedPage.confirmationMessage(LoginPageTest.driver).isDisplayed(), "Order has not " +
                "been " +
                "completed");
    }
}
