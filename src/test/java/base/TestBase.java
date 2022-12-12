package base;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase  {
    protected static WebDriver driver;
    protected  static Properties prop;
    @Step("Start the test, open https://www.ivi.ru website")
    @BeforeTest
    public static void start() {
        System.setProperty("webdriver.chrome.driver", "C:/Браузер/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.ivi.ru");
    }

    @AfterTest
    public static void end() {
        driver.quit();
    }
}
