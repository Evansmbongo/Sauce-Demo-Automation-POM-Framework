package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderCompletedPage {
    public static WebElement confirmationMessage(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//h2[@class='complete-header']"));
        return element;
    }
}
