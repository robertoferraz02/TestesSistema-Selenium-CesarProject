package stepsLista;

import Pages.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepsLista {

    private WebDriver driver;

    @Before

    public void beforeTests(){

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        this.driver = new ChromeDriver();

        driver.get("https://www.saraiva.com.br");
        driver.manage().window().maximize();
    }


    //TESTES LISTA ---- PRIMEIRO CENÁRIO
    @Given("user searches for any item")
    public void user_searches_for_any_item() {

       new ListaPageOne(driver).lista_add_primeiro_click();

    }

    @Then("select desired item on the search list")
    public void select_desired_item_on_the_search_list() {

        new ListaPageTwo(driver).lista_add_segundo_click();

    }

    @Then("add the item on the wishlist")
    public void add_the_item_on_the_wishlist() {

        new ListaPageThree(driver).lista_add_terceiro_click();

    }


    @Then("login on the website")
    public void login_on_the_website() {

        new ListaPageFour(driver).lista_login_primeiro_click();

    }

    @Then("validates if login was successful")
    public void validates_if_login_was_successful() {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        new ListaPageFive(driver).lista_login_validacao();

        Assert.assertEquals("Cucumber", "Cucumber");
    }




    //TESTES LISTA ---- SEGUNDO CENÁRIO
    @Given("user clicks on whishlist")
    public void user_clicks_on_whishlist() {

    new ValidateListaPageOne(driver).validar_item_lista_primeiro_click();

    }

    @Then("makes login")
    public void makes_login() {

        new ValidateListaPageTwo(driver).validar_item_lista_segundo_click();

    }

    @And("validates if the item appears on the wishlist")
    public void validates_if_the_item_appears_on_the_wishlist() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new ValidateListaPageThree(driver).validacao_item_lista_();

        Assert.assertEquals("Algoritimos e Lógica de Programação - 2ª Ed.", "Algoritimos e Lógica de Programação - 2ª Ed.");

    }





    //TESTES LISTA ---- TERCEIRO CENÁRIO
    @Given("user clicks on wishlist button in the menu")
    public void user_clicks_on_wishlist_button_in_the_menu() {

        new RemoveListaPageOne(driver).remover_item_lista_primeiro_click();

    }

    @Then("login on website")
    public void login_on_website() {
        new RemoveListaPageTwo(driver).remover_item_lista_login();
    }

    @Then("click on remove item in the wishlist")
    public void click_on_remove_item_in_the_wishlist() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new RemoveListaPageThree(driver).remover_item_lista_segundo_click();

    }

    @Then("validates if the action was well succeed")
    public void validates_if_the_action_was_well_succeed() {

        new RemoveListaPageThree(driver).remove_item_lista_validacao();

        Assert.assertEquals("Adicione produtos que deseja comprar em sua lista de desejos.",
                "Adicione produtos que deseja comprar em sua lista de desejos.");

    }


    @After
    public void tearDown() throws InterruptedException {

        this.driver.quit();

    }

}
