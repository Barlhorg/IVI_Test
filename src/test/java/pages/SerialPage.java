package pages;

import base.TestBase;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class SerialPage extends TestBase {

    @Step("Open \"Лучшее в подборке\" list")
    public static BestMovies clickOnBestSerials() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.of(30, ChronoUnit.SECONDS));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title='Сериалы-новинки']")));
        driver.findElement(By.xpath("//div[@title='Сериалы-новинки']")).click();
        return new BestMovies();
    }
}
