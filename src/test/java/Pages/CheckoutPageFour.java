package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPageFour extends MainPage {

    public CheckoutPageFour (WebDriver driver){

        super(driver);
    }

    public CheckoutPageFour checkout_informa_dados(){

        //numero cartão
        driver.findElement(By.cssSelector("#cc_number_new")).sendKeys("5546562531088077");

        //código de segurança
        driver.findElement(By.cssSelector("#cc_cvv_new")).sendKeys("951");

        //mês
        WebElement selectMonth = driver.findElement(By.cssSelector("#cc_validity_new > select.month"));
        Select combobox = new Select(selectMonth);
        combobox.selectByVisibleText("08 - agosto");

        //ano
        WebElement selectYear = driver.findElement(By.cssSelector("#cc_validity_new > select.year"));
        Select combobox2 = new Select(selectYear);
        combobox2.selectByVisibleText("2019");

        //parcelas
        WebElement selectInstallment = driver.findElement(By.cssSelector("#cc_installment"));
        Select combobox3 = new Select(selectInstallment);
        combobox3.selectByVisibleText("1x sem juros - R$185,90");

        //nome
        driver.findElement(By.cssSelector("#cc_holder_new")).sendKeys("Cucumber da Silva");

        return this;
    }

    public CheckoutPageFour checkout_desmarca_salvar_dados_click(){

        driver.findElement(By.cssSelector("#newcard_form > div > span")).click();

        return this;
    }

    public CheckoutPageFour checkout_continuar_botao_click(){

        driver.findElement(By.cssSelector("#newcard_form > button")).click();

        return this;
    }

    public CheckoutPageFour checkout_validacao_erro (){

        driver.findElement(By.cssSelector("#shipping-please-wait > div.alert__fake p")).getText();

        return this;
    }
}
