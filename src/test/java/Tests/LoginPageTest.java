package Tests;

import Pages.ItemsPage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest {
    public static WebDriver driver;

    @BeforeMethod
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/EvansMbongo/Desktop/SeleniumJava/Sauce-Demo" +
                "-Automation-POM/src/main/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void loginTest() {
        LoginPage.username(driver).sendKeys("standard_user");
        LoginPage.password(driver).sendKeys("secret_sauce");
        LoginPage.loginButton(driver).click();
    }
}
