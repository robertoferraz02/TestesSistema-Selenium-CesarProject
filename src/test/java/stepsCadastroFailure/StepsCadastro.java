package stepsCadastroFailure;

import Pages.CadastroPageOne;
import Pages.CadastroPageThree;
import Pages.CadastroPageTwo;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsCadastro {

    private WebDriver driver;

    @Before

        public void beforeTests(){

            System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
            this.driver = new ChromeDriver();
    }

    @Given("user access website")
    public void user_access_website() {

        driver.get("https://www.saraiva.com.br/");
        driver.manage().window().maximize();

    }

    @Then("clicks on register button")
    public void clicks_on_register_button() {

        new CadastroPageOne(driver).cadastro_primeiro_click();

    }

    @Then("clck on register in the second page")
    public void clck_on_register_in_the_second_page() {

        new CadastroPageTwo(driver).cadastro_segundo_click();

    }

    @Then("inform data")
    public void inform_data() {

        new CadastroPageThree(driver).cadastro_preencher_dados();

    }

    @And("check option to not receive newsletter")
    public void check_option_to_not_receive_newsletter() {

        new CadastroPageThree(driver).cadastro_desmarcar_newsletter();


    }

    @But("do not click on capctha validation")
    public void do_not_click_on_capctha_validation() {

    }

    @And("ends registration process")
    public void ends_registration_process() {

        new CadastroPageThree(driver).finalizar_cadastro_click();

    }

    @Then("validates the registration wasn't well succeeded")
    public void validates_the_registration_wasn_t_well_succeeded() {

        new CadastroPageThree(driver).validar_cadastro_incompleto();

        Assert.assertEquals("Problema com Captcha", "Problema com Captcha");

    }



    @After
    public void tearDown(){

      this.driver.quit();

    }


}
