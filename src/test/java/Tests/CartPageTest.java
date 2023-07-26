package Tests;

import Pages.CartPage;
import Pages.ItemsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartPageTest {
    @BeforeMethod
    public void setUp(){
        ItemsPageTest itemsPageTest = new ItemsPageTest();
        itemsPageTest.setUp();
        itemsPageTest.clickItems();

    }
    @Test
    public void verifyAndCheckout(){
        Assert.assertTrue(CartPage.backPack(LoginPageTest.driver).isDisplayed());
        Assert.assertTrue(CartPage.boltShirt(LoginPageTest.driver).isDisplayed());
        Assert.assertTrue(CartPage.Onesie(LoginPageTest.driver).isDisplayed());

//        Click on Checkout
        CartPage.clickCheckout(LoginPageTest.driver).click();
    }
}
