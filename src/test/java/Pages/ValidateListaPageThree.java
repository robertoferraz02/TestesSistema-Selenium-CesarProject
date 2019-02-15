package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidateListaPageThree  extends MainPage {

    public ValidateListaPageThree(WebDriver driver) {

        super(driver);
    }

    public ValidateListaPageThree validacao_item_lista_(){

        //valida se o produto escolhido está na lista
        driver.findElement(By.cssSelector("#expressoes_curtix+h3.product-name a")).getText();

        return this;
    }

}
