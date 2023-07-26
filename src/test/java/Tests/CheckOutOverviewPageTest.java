package Tests;

import Pages.CheckoutOverviewPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Tests.LoginPageTest.driver;

public class CheckOutOverviewPageTest {
    //WebDriver driver;

    @BeforeMethod
    public void setUp(){
        OrderInfoPageTest orderInfoPageTest = new OrderInfoPageTest();
        orderInfoPageTest.setUp();
        orderInfoPageTest.orderInfoFill();
    }
    @Test
    public void totalAssertion() {
        Assert.assertEquals(CheckoutOverviewPage.priceList(driver), CheckoutOverviewPage.totalPrice(driver), "Price Total" +
                " and " +
                "tax does not equal Total");

//       Click on Finish
        CheckoutOverviewPage.clickFinish(driver).click();
    }
}
