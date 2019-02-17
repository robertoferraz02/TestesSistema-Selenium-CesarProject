package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CheckoutPageThree extends MainPage {

    public CheckoutPageThree (WebDriver driver){

        super(driver);
    }

    public CheckoutPageThree checkout_selecionar_retirada_click(){

        WebElement selectRetirada = (new WebDriverWait(driver, 40))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#deliveryInStore")));
        driver.findElement(By.cssSelector("#deliveryInStore")).click();

        return this;
    }

    public CheckoutPageThree checkout_selecionar_estado_click (){

        WebElement selectState = driver.findElement(By.cssSelector("#shipping-store .shipstore_get"));
        Select combobox = new Select(selectState);
        combobox.selectByVisibleText("Pernambuco");

        return this;
    }

    public CheckoutPageThree checkout_selecionar_loja_click (){

        WebElement selectStore = driver.findElement(By.cssSelector("#shipping-store .store_listing"));
        Select combobox = new Select(selectStore);
        combobox.selectByVisibleText("Shopping RioMar Recife");

        return this;
    }

    public CheckoutPageFour checkout_continuar_processo_click () {

        WebElement selectWaitBtn = (new WebDriverWait(driver, 40))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#checkout_onepage > ul+section+section .co_bt_continue")));
        driver.findElement(By.cssSelector("#checkout_onepage > ul+section+section .co_bt_continue")).click();

        return new CheckoutPageFour(driver);

    }



}
