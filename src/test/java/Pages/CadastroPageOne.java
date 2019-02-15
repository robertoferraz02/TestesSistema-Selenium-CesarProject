package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroPageOne extends MainPage{

    public CadastroPageOne(WebDriver driver){

            super(driver);
    }

    public CadastroPageTwo cadastro_primeiro_click(){

        driver.findElement(By.cssSelector("#header > div > section.mini-navigation > ul > li > a.icon")).click();

        return new CadastroPageTwo (driver);
    }

}
