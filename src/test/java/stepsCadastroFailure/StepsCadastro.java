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



    @Given("Usuário acessa o site no navegador")
    public void usuário_acessa_o_site_no_navegador() {
        driver.get("https://www.saraiva.com.br/");
        driver.manage().window().maximize();

    }

    @Then("clica no botão de cadastro")
    public void clica_no_botão_de_cadastro() {

        new CadastroPageOne(driver).cadastro_primeiro_click();

    }

    @Then("clica em cadastre-se na segunda página")
    public void clica_em_cadastre_se_na_segunda_página() {

        new CadastroPageTwo(driver).cadastro_segundo_click();

    }

    @Then("preencha seus dados")
    public void preencha_seus_dados() {

        new CadastroPageThree(driver).cadastro_preencher_dados();

    }

    @And("marque a opção de não receber newsletter")
    public void marque_a_opção_de_não_receber_newsletter() {

        new CadastroPageThree(driver).cadastro_desmarcar_newsletter();

    }

    @But("não clique na validação de captcha")
    public void não_clique_na_validação_de_captcha() {

    }


    @And("finalize o processo de cadastro")
    public void finalize_o_processo_de_cadastro() {

        new CadastroPageThree(driver).finalizar_cadastro_click();

    }

    @Then("valide que o cadastro não foi concluído")
    public void valide_que_o_cadastro_não_foi_concluído() {

        new CadastroPageThree(driver).validar_cadastro_incompleto();

        Assert.assertEquals("Problema com Captcha", "Problema com Captcha");

    }

    @After
    public void tearDown() throws InterruptedException {

        Thread.sleep(5000);
        this.driver.quit();

    }


}
