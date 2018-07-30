package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;

public class GooglePage {

    public WebDriver driver;

    public GooglePage(WebDriver driver){
        this.driver = driver;
    }

    public void fieldRamblerSelenide(String word){
        $(By.id("search_form_input_homepage")).sendKeys(word);
    }

    public void buttonSearchSelenide(){
        $(By.id("search_button_homepage")).click();
    }
//////////////////////////////////// - selenium selectors


    public void fieldRambler(String word){
        driver.findElement(By.id("search_button_homepage")).click();
        driver.findElement(By.id("search_button_homepage")).sendKeys(word);
    }

    public void buttonSearch(){
        driver.findElement(By.id("search_button_homepage")).click();
    }

}
