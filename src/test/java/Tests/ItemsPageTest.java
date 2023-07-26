package Tests;

import Pages.ItemsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Pages.ItemsPage.*;

public class ItemsPageTest{

    @BeforeMethod
    public void setUp(){
        LoginPageTest.setUp();
        LoginPageTest loginPageTest = new LoginPageTest();
        loginPageTest.loginTest();
    }
    @Test
    public void clickItems(){
        // Click items
        ItemsPage.onesie(LoginPageTest.driver).click();
        ItemsPage.backpack(LoginPageTest.driver).click();
        ItemsPage.bolt(LoginPageTest.driver).click();

        // Validate cart number
        Assert.assertEquals(ItemsPage.validateCartNumber(LoginPageTest.driver).getText(), "3", "Cart not equal to 3" +
                "match");
        // Click cart icon
        ItemsPage.clickCartIcon(LoginPageTest.driver).click();



    }
}
