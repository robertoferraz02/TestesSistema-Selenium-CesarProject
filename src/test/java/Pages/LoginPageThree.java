package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageThree extends MainPage {

    public LoginPageThree (WebDriver driver){

        super(driver);
    }

    public LoginPageThree validar_login(){

        driver.findElement(By.cssSelector("#header > div > section.mini-navigation " +
                "> ul > li.my-account.logged-in > a > span > span")).getText();

        return this;
    }

}
