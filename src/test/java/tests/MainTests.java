package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.GooglePage;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class MainTests {

    public GooglePage googlePage;

    @Test
    public void userCanSearchAnyKeyword() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
        Configuration.browser = "chrome";

        open("http://google.com");
        $(By.name("q")).val("selenide").pressEnter();
        $$("#ires .g").shouldHave(CollectionCondition.size(10));
        $("#ires .g").shouldHave(Condition.text("selenide.org"));
    }

    @Test
    public void onlyWebdriver(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        googlePage = new GooglePage(driver);
        driver.get("https://duckduckgo.com/");
        //googlePage.fieldRamblerSelenide("selenium");
        //googlePage.buttonSearchSelenide();
        googlePage.fieldRambler("ллллэээ     ");
        googlePage.buttonSearch();

    }

}
