package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidateListaPageTwo extends MainPage {

    public ValidateListaPageTwo (WebDriver driver){

        super(driver);
    }

    public ValidateListaPageThree validar_item_lista_segundo_click(){

        //email
        driver.findElement(By.cssSelector("#email")).sendKeys("projetocesar.testesistemas@gmail.com");

        //senha
        driver.findElement(By.cssSelector("#pass")).sendKeys("010101010101");

        //continuar
        driver.findElement(By.cssSelector("#send2")).click();

        return new ValidateListaPageThree(driver);
    }
}
