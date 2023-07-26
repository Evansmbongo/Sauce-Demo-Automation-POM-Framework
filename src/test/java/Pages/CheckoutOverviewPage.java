package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckoutOverviewPage {
    public static float priceList(WebDriver driver) {
        float sum = 0.0f;
        float tax = 4.32f;
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class = 'inventory_item_price']"));
        for (WebElement priceElement : elements) {
            String priceText = priceElement.getText();
            String priceValue = priceText.replaceAll("[^0-9.]", "");
            float price = Float.parseFloat(priceValue);
            sum += price;
        }
        float actualTotal = sum + tax;
        return actualTotal;
    }

    public static float totalPrice(WebDriver driver){
        WebElement total = driver.findElement(By.xpath("//div[@class='summary_info_label summary_total_label']"));
        String totalText = total.getText();
        String totalValue = totalText.replaceAll("[^0-9.]", "");
        float expectedTotal = Float.parseFloat(totalValue);
        return expectedTotal;
    }

    public static WebElement clickFinish(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//button[@id='finish']"));
        return element;
    }
}
