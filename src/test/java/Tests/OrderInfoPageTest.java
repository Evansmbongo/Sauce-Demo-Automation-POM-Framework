package Tests;

import Pages.OrderInfoPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderInfoPageTest {
    @BeforeMethod
    public void setUp(){
        CartPageTest cartPageTest = new CartPageTest();
        cartPageTest.setUp();
        cartPageTest.verifyAndCheckout();
    }
    @Test
    public void orderInfoFill(){
        OrderInfoPage.firstName(LoginPageTest.driver).sendKeys("Test");
        OrderInfoPage.lastName(LoginPageTest.driver).sendKeys("Ignore");
        OrderInfoPage.zipCode(LoginPageTest.driver).sendKeys("123");

//        Click continue
        OrderInfoPage.clickContinue(LoginPageTest.driver).click();
    }
}
