package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.applet.Main;

public class ChekoutPageOne extends MainPage {

    public ChekoutPageOne (WebDriver driver){

        super(driver);
    }

    public CheckoutPageTwo checkout_continuar_click(){

        driver.findElement(By.cssSelector("#shopping-cart-totals-table+ul > li")).click();

        return new CheckoutPageTwo (driver);
    }
}
