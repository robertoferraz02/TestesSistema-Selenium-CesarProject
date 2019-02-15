package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveListaPageOne extends MainPage {

    public RemoveListaPageOne (WebDriver driver){

        super(driver);
    }

    public RemoveListaPageTwo remover_item_lista_primeiro_click(){

        //clica na lista de desejos
        driver.findElement(By.cssSelector("#header > div > div+section+section > ul > li+li+li a.icon")).click();

        return new RemoveListaPageTwo (driver);

    }
}
