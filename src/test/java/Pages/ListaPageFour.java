package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaPageFour extends MainPage {

    public ListaPageFour (WebDriver driver){

        super(driver);
    }

    public ListaPageFive lista_login_primeiro_click(){

        //email
        driver.findElement(By.cssSelector("#email")).sendKeys("projetocesar.testesistemas@gmail.com");

        //senha
        driver.findElement(By.cssSelector("#pass")).sendKeys("010101010101");

        //continuar
        driver.findElement(By.cssSelector("#send2")).click();

        return new ListaPageFive (driver);

    }
}
