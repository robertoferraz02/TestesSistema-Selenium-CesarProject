package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveListaPageThree extends MainPage {

    public RemoveListaPageThree (WebDriver driver){

        super(driver);
        }

        public RemoveListaPageThree remover_item_lista_segundo_click(){

        //clica em remover item da lista
        driver.findElement(By.cssSelector("#wishlist-table div.wishlist-cell2.customer-wishlist-item-price_cart > div.actions > a.btn-remove")).click();

        return this;

        }

        public RemoveListaPageThree remove_item_lista_validacao(){

        driver.findElement(By.cssSelector("#wishlist-view-form > div > div.wishlist-empty > div > span")).getText();

        return this;

        }

}
