package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderInfoPage {
    public static WebElement firstName(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//input[@id='first-name']"));
        return element;
    }
    public static WebElement lastName(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//input[@id='last-name']"));
        return element;
    }
    public static WebElement zipCode(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//input[@id='postal-code']"));
        return element;
    }
    public static WebElement clickContinue(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//input[@id='continue']"));
        return element;
    }
}
