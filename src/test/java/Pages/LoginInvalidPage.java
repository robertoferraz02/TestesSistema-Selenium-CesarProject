package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginInvalidPage extends MainPage {

    public LoginInvalidPage(WebDriver driver){

        super(driver);
    }

    public LoginInvalidPage login_email_valido(){

        driver.findElement(By.cssSelector("#email")).sendKeys("projetocesar.testesistemas@gmail.com");

        return this;
    }

    public LoginInvalidPage login_senha_invalida(){

        driver.findElement(By.cssSelector("#pass")).sendKeys("010101");

        return this;
    }

    public LoginInvalidPage login_invalido_validacao(){

        driver.findElement(By.cssSelector("#core_messages > ul > li > ul > li")).getText();

        return this;
    }
}
