package Pages;

import Tests.LoginPageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemsPage {
    public static WebElement backpack(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs" +
                "-backpack']"));
        return element;
    }
    public static WebElement onesie(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
        return element;
    }
    public static WebElement bolt(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        return element;
    }
    public static WebElement validateCartNumber(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
        return element;
    }
    public static WebElement clickCartIcon(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        return element;

    }

}
