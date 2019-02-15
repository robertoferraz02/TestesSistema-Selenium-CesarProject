package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaPageOne extends MainPage{

    public ListaPageOne (WebDriver driver){

        super(driver);
    }

    public ListaPageTwo lista_add_primeiro_click(){

        //searches for the desired item
        driver.findElement(By.cssSelector("#chaordic-widget-container > div #q")).sendKeys("programação");
        driver.findElement(By.cssSelector("#chaordic-search-button")).click();

        return new ListaPageTwo (driver);
    }
}
