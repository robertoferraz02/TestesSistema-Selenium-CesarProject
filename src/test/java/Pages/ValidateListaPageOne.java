package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidateListaPageOne extends MainPage {

    public ValidateListaPageOne (WebDriver driver){

        super(driver);
    }

    public ValidateListaPageTwo validar_item_lista_primeiro_click(){

        //usuário clica em lista de desejos
        driver.findElement(By.cssSelector("#header > div > div+section+section > ul > li+li+li a.icon")).click();

        return new ValidateListaPageTwo (driver);
    }
}
