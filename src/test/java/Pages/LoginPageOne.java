package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageOne extends MainPage {

    public LoginPageOne(WebDriver driver){

        super(driver);
    }

    public LoginPageTwo login_primeiro_click(){

        driver.findElement(By.cssSelector("#header > div > section.mini-navigation > ul > li > a.icon")).click();

        return new LoginPageTwo (driver);
    }

}
