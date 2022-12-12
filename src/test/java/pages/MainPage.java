package pages;

import base.TestBase;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends TestBase {

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    @Step("open \"Фильмы\" category")
    public static FilmsPage clickOnFilms() {
        driver.findElement(By.xpath("//div[text()='Фильмы']")).click();
        return new FilmsPage();
    }
    public static SerialPage clickOnSerials() {
        driver.findElement(By.xpath("//div[text()='Сериалы']")).click();
        return new SerialPage();
    }
}
