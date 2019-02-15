package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompraPageOne extends MainPage {

    public CompraPageOne (WebDriver driver){

        super(driver);
    }

    public CompraPageTwo compra_procurar_item_click(){

        //pesquisa por item desejado
        driver.findElement(By.cssSelector("#chaordic-widget-container > div #q")).sendKeys("vade mecum");
        driver.findElement(By.cssSelector("#chaordic-search-button")).click();

        return new CompraPageTwo(driver);

    }

}
