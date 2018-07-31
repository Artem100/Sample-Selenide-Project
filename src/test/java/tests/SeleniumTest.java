package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class SeleniumTest {

    @Test
    public void userCanSearchAnyKeyword() {
        System.setProperty("webdriver.chrome.driver", "/home/admin1/driver/chromedriver");
        //System.setProperty("webdriver.chrome.driver", ("user.dir") + "/drivers/chromedriver");
        Configuration.browser = "chrome";
        open("https://mail.ukr.net/desktop/login");
    }
}
