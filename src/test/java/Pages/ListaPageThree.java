package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaPageThree extends MainPage{

    public ListaPageThree (WebDriver driver){

        super(driver);
    }

    public ListaPageFour lista_add_terceiro_click(){

        //adiciona item a lista
        driver.findElement(By.cssSelector("#pdp-slider > div+div .wishlist")).click();

        return new ListaPageFour(driver);
    }


}
