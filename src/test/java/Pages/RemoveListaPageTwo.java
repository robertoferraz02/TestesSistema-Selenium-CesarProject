package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveListaPageTwo extends MainPage {

    public RemoveListaPageTwo (WebDriver driver){

        super(driver);
    }

    public RemoveListaPageThree remover_item_lista_login(){

        //email
        driver.findElement(By.cssSelector("#email")).sendKeys("projetocesar.testesistemas@gmail.com");

        //senha
        driver.findElement(By.cssSelector("#pass")).sendKeys("010101010101");

        //continuar
        driver.findElement(By.cssSelector("#send2")).click();

        return new RemoveListaPageThree(driver);
    }

}
