package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveCompraPageOne extends MainPage {

    public RemoveCompraPageOne (WebDriver driver){

        super(driver);
    }

    public RemoveCompraPageOne compra_remove_item_click (){

        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-actions.a-center > a")).click();

        return this;

    }

    public RemoveCompraPageOne compra_remove_item_validacao (){

        driver.findElement(By.cssSelector(".icon.icon-cart.icon-absolute h2.message-error")).getText();

        return this;

    }


}
