package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompraPageTwo extends MainPage {

    public CompraPageTwo(WebDriver driver) {

        super(driver);
    }

    public CompraPageThree compra_selecionar_item_click() {

        //seleciona item da busca
        driver.findElement(By.cssSelector("#nm-product-10504412 > div.nm-product-img-container > a > img")).click();

        return new CompraPageThree(driver);
    }

}
