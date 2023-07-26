package Pages;

import Tests.LoginPageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

public class CartPage {
    public static WebElement backPack(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Sauce" +
                " Labs Backpack']"));
        return element;
    }
    public static WebElement Onesie(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Onesie']"));
        return element;
    }

    public static WebElement boltShirt(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Bolt T-Shirt']"));
        return element;
    }

    public static WebElement clickCheckout(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//button[@id='checkout']"));
        return element;
    }
}
