package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompraPageFour extends MainPage {

    public CompraPageFour (WebDriver driver) {

        super(driver);
    }

    public CompraPageFour compra_validar_carrinho(){

        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-info > h2 > a")).getText();

        return this;
    }
}
