package stepsLogin;

import Pages.LoginInvalidPage;
import Pages.LoginPageOne;
import Pages.LoginPageThree;
import Pages.LoginPageTwo;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class StepsLogin {

    private WebDriver driver;

    @Before

    public void beforeTests(){

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    //TESTES LOGIN ---- PRIMEIRO CENÁRIO

    @Given("user accesses the site")
    public void user_accesses_the_site() {

        driver.get("http://www.saraiva.com.br");
        driver.manage().window().maximize();

    }

    @And("clicks to make login")
    public void clicks_to_make_login() {

        new LoginPageOne(driver).login_primeiro_click();

    }

    @Then("inform login and password")
    public void inform_login_and_password() {

        new LoginPageTwo(driver).login_segundo_click();

    }

    @Then("click to continue")
    public void click_to_continue() {

        new LoginPageTwo(driver).login_terceiro_click();

    }

    @Then("validates if login was made")
    public void validates_if_login_was_made() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new LoginPageThree(driver).validar_login();

    }




    //TESTES LOGIN ---- SEGUNDO CENÁRIO

    @Given("user opens the site")
    public void user_opens_the_site() {

        driver.get("http://www.saraiva.com.br");
        driver.manage().window().maximize();

    }

    @Given("click on login button")
    public void click_on_login_button() {

        new LoginPageOne(driver).login_primeiro_click();

    }

    @Then("inform a valid login")
    public void inform_a_valid_login() {

        new LoginInvalidPage(driver).login_email_valido();
    }

    @Then("a wrong password")
    public void a_wrong_password() {

        new LoginInvalidPage(driver).login_senha_invalida();

    }

    @Then("click continue")
    public void click_continue() {

        new LoginPageTwo(driver).login_terceiro_click();

    }

    @Then("validate unsuccessful login")
    public void validate_unsuccessful_login() {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        new LoginInvalidPage(driver).login_invalido_validacao();

        Assert.assertEquals("Acesso ou senha inválida.", "Acesso ou senha inválida.");

    }

    @After
    public void tearDown() throws InterruptedException {

       this.driver.quit();

    }

}
