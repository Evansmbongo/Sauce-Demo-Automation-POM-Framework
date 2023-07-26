package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public static WebDriver driver;
    public static WebElement username (WebDriver driver){
        WebElement element =  driver.findElement(By.xpath("//input[@id='user-name']"));
        return element;
    }

    public static WebElement password(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//input[@id='password']"));
        return element;
    }

    public static WebElement loginButton(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("(//input[@id='login-button'])[1]"));
        return element;
    }
}
