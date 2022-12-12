package pages;

import base.TestBase;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MostPopularSerials extends TestBase {
    private static By favoriteButton = By.xpath("(//button[@class=\"nbl-button nbl-button_iconMode_withIcon nbl-button_style_dafu nbl-button_size_drahmin nbl-button_hasBadge_0 userButtons__nbl-button\"])[2]");
    private static By profile = By.xpath("//a[@class='headerAvatar__link']");
    private static By watchLater = By.xpath("//div[text()='Смотреть позже']");
    private static By movieTitle = By.tagName("h1");
    private static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    @Step("get a movie title")
    public static String getName() {
        return driver.findElement(movieTitle).getText();
    }

    @Step("add the movie to \"Смотреть позже\" list")
    public static void clickOnFavoriteButton() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(favoriteButton));
        driver.findElement(favoriteButton).click();
        Thread.sleep(10000);
    }

    @Step("move a mouse courser to a profile icon")
    public static void moveToProfile() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(profile)).build().perform();
    }

    @Step("open a \"Смотреть позже\" list")
    public static ProfilePage clickOnWatchLater() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(watchLater));
        driver.findElement(watchLater).click();
        Thread.sleep(10000);
        return new ProfilePage();
    }
}
