package tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginBySelenide;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenide {
    public static LoginBySelenide loginBySelenide = new LoginBySelenide();

    @Test
    public void test(){
        Configuration.browser = "chrome";
        open("http://jira.hillel.it:8080/login.jsp");
        loginBySelenide.loginField("");
        loginBySelenide.passwordField("");
        loginBySelenide.loginButton();
    }

    @Test
    public void googleSearch() {
        open("http://google.com");
        $(By.name("q")).val("selenide").pressEnter();
        $$("#ires .g").shouldHave(size(10));
        $("#ires .g").shouldHave(text("selenide.org"));
    }
}
