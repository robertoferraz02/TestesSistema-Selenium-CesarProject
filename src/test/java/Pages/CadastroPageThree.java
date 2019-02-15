package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CadastroPageThree extends MainPage {

    public CadastroPageThree (WebDriver driver){

        super (driver);
    }

    public CadastroPageThree cadastro_preencher_dados(){

        //nome
        driver.findElement(By.cssSelector("#firstname_pf")).sendKeys("Cucumber");
        //sobrenome
        driver.findElement(By.cssSelector("#lastname.input-text")).sendKeys("da Silva");
        //email
        driver.findElement(By.cssSelector("#email_address_pf")).sendKeys("projetocesar.testesistemas@gmail.com");
        //senha
        driver.findElement(By.cssSelector("#password[type=password]")).sendKeys("010101010101");
        //confirmar senha
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("010101010101");
        //CPF
        driver.findElement(By.cssSelector("#cpf-number")).sendKeys("81293926078");
        //genero
        WebElement selectGenre = driver.findElement(By.cssSelector("#gender"));
        Select combobox = new Select(selectGenre);
        combobox.selectByVisibleText("Masculino");
        //dt_nascimento
        driver.findElement(By.cssSelector("#fulldob[type=tel]")).sendKeys("28061991");
        //endereço
        driver.findElement(By.name("address[postcode]")).sendKeys("51190360");

        WebElement numero = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.name("address[numero_endereco]")));
        driver.findElement(By.name("address[numero_endereco]")).sendKeys("202");

        //telefone
        driver.findElement(By.cssSelector("#telephone_pf")).sendKeys("8199888899");

        return this;

    }

    public CadastroPageThree cadastro_desmarcar_newsletter(){

        driver.findElement(By.cssSelector("#form-validate-register > ul > li.control.checkbox > label")).click();

        return this;
    }


    public CadastroPageThree finalizar_cadastro_click(){

        driver.findElement(By.cssSelector("#form-validate-register > div > button")).click();

        return this;
    }

    public CadastroPageThree validar_cadastro_incompleto(){

       driver.findElement(By.cssSelector("#core_messages > ul > li > ul > li")).getText();

        return this;

    }

}
