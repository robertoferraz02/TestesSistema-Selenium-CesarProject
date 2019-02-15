package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTwo extends MainPage {

    public LoginPageTwo (WebDriver driver){

        super(driver);
    }

    public LoginPageTwo login_segundo_click(){

        //email
        driver.findElement(By.cssSelector("#email")).sendKeys("projetocesar.testesistemas@gmail.com");
        //senha
        driver.findElement(By.cssSelector("#pass")).sendKeys("010101010101");

        return this;
    }

    public LoginPageThree login_terceiro_click(){

        //continuar
        driver.findElement(By.cssSelector("#send2")).click();

        return new LoginPageThree(driver);

    }

}
