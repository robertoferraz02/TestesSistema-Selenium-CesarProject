package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaPageFive extends MainPage {

    public ListaPageFive(WebDriver driver) {

        super(driver);
    }

    public ListaPageFive lista_login_validacao(){

        driver.findElement(By.cssSelector("body > header > div.header-wrap.wrapper > div > span > span.media-body.header-username > span")).getText();

        return this;
    }
}


