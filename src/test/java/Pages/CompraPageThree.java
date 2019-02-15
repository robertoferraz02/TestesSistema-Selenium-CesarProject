package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompraPageThree extends MainPage {

    public CompraPageThree(WebDriver driver) {

        super(driver);
    }

    public CompraPageThree compra_calculo_frete_click() {

        //informa cep e calcula valor de frete
        driver.findElement(By.cssSelector("#shipping > div > div .search_form > input.zip_search")).sendKeys("51190360");
        driver.findElement(By.cssSelector("#shipping > div.zip > div > div.search_form > b > a")).click();

        return this;
    }

    public CompraPageFour compra_botao_comprar_click(){

        driver.findElement(By.cssSelector("#product_addtocart_form > button")).click();

        return new CompraPageFour(driver);

    }
}
