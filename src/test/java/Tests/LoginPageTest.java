package Tests;

import Pages.ItemsPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest {
    public static WebDriver driver;
    public static String myBrowser = "edge";
    @BeforeMethod
    public static void setUp() {
        if (myBrowser.equals("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        }

       if (myBrowser.equals("firefox")) {
           FirefoxOptions options = new FirefoxOptions();
           options.addArguments("--headless");
           driver = new FirefoxDriver(options);
        }
       else if (myBrowser.equals("edge")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--headless");
            driver = new EdgeDriver(options);
        }

       driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void loginTest() {
        LoginPage.username(driver).sendKeys("standard_user");
        LoginPage.password(driver).sendKeys("secret_sauce");
        LoginPage.loginButton(driver).click();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
