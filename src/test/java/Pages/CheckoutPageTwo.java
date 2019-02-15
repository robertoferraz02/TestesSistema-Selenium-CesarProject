package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageTwo extends MainPage {

    public CheckoutPageTwo (WebDriver driver){

        super(driver);
    }

    public CheckoutPageThree checkout_login_click(){

        //email
        driver.findElement(By.cssSelector("#login-email")).sendKeys("projetocesar.testesistemas@gmail.com");

        //senha
        driver.findElement(By.cssSelector("#login-password")).sendKeys("010101010101");

        //continuar
        driver.findElement(By.cssSelector("#send2")).click();

        return new CheckoutPageThree (driver);

    }
}
