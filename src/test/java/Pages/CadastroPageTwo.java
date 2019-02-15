package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroPageTwo extends MainPage{

    public CadastroPageTwo(WebDriver driver){

        super (driver);
    }

    public CadastroPageThree cadastro_segundo_click(){

        driver.findElement(By.cssSelector("#login-form > div > div > div.newUser > a.btn-secondary")).click();

        return new CadastroPageThree (driver);

    }


}
