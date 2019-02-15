package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaPageTwo extends MainPage{

    public ListaPageTwo (WebDriver driver){

        super(driver);
    }

    public ListaPageThree lista_add_segundo_click(){

        //Select the desired item on the search list
        driver.findElement(By.cssSelector("#nm-product-3420551 > div.nm-product-info > h2 > a")).click();

        return new ListaPageThree (driver);

    }
}
