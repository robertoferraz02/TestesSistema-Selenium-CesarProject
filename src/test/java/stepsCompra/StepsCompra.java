package stepsCompra;

import Pages.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepsCompra {

    private WebDriver driver;

    @Before

    public void beforeTests(){

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        this.driver = new ChromeDriver();

        driver.get("http://www.saraiva.com.br");
        driver.manage().window().maximize();

    }

    //TESTES COMPRA ---- PRIMEIRO CENÁRIO
    @Given("user searches for an item on the search bar")
    public void user_searches_for_an_item_on_the_search_bar() {

        new CompraPageOne(driver).compra_procurar_item_click();

    }

    @Then("select the desired item")
    public void select_the_desired_item() {

        new CompraPageTwo(driver).compra_selecionar_item_click();

    }

    @Then("inform zip code to calc freight tax")
    public void inform_zip_code_to_calc_freight_tax() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new CompraPageThree(driver).compra_calculo_frete_click();

    }

    @And("click on buy to add product to the cart")
    public void click_on_buy_to_add_product_to_the_cart() {

        new CompraPageThree(driver).compra_botao_comprar_click();

    }

    @Then("validate if item was added to the cart")
    public void validate_if_item_was_added_to_the_cart() {

        new CompraPageFour(driver).compra_validar_carrinho();

        Assert.assertEquals("Vade Mecum Tradicional - 27ª Ed. 2019", "Vade Mecum Tradicional - 27ª Ed. 2019");

    }





    ////TESTES COMPRA ---- SEGUNDO CENÁRIO
    @Given("user added an item to the cart")
    public void user_added_an_item_to_the_cart() {

        new CompraPageOne(driver).compra_procurar_item_click();

        new CompraPageTwo(driver).compra_selecionar_item_click();

        new CompraPageThree(driver).compra_calculo_frete_click()
                .compra_botao_comprar_click();

    }


    @And("removes one item from it")
    public void removes_one_item_from_it() {

        new RemoveCompraPageOne(driver).compra_remove_item_click();

    }

    @Then("validates the removal")
    public void validates_the_removal() {

        new RemoveCompraPageOne(driver).compra_remove_item_validacao();

    }





    //TESTES COMPRA ---- TERCEIRO CENÁRIO


    @When("user has added an item into cart")
    public void user_has_added_an_item_into_cart() {

        new CompraPageOne(driver).compra_procurar_item_click();

        new CompraPageTwo(driver).compra_selecionar_item_click();

        new CompraPageThree(driver).compra_calculo_frete_click()
                .compra_botao_comprar_click();

    }


    @Then("click on continue button")
    public void click_on_continue_button() {

        new ChekoutPageOne(driver).checkout_continuar_click();

    }

    @Given("login is made")
    public void login_is_made() {

        new CheckoutPageTwo(driver).checkout_login_click();

    }

    @Then("chooses to pick product on the store")
    public void chooses_to_pick_product_on_the_store() {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        new CheckoutPageThree(driver).checkout_selecionar_retirada_click();

    }

    @And("choose state")
    public void choose_state() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new CheckoutPageThree(driver).checkout_selecionar_estado_click();

    }


    @And("choose selected store")
    public void choose_selected_store() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new CheckoutPageThree(driver).checkout_selecionar_loja_click();

    }


    @Then("proceed process clicking to continue")
    public void proceed_process_clicking_to_continue() {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        new CheckoutPageThree(driver).checkout_continuar_processo_click();

    }

    @Then("inform checkout data")
    public void inform_checkout_data() {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        new CheckoutPageFour(driver).checkout_informa_dados();

    }

    @But("chooses to not save data for the next purchase")
    public void chooses_to_not_save_data_for_the_next_purchase() {

        new CheckoutPageFour(driver).checkout_desmarca_salvar_dados_click();

    }

    @And("clicks to close order")
    public void clicks_to_close_order() {

        new CheckoutPageFour(driver).checkout_continuar_botao_click();

    }

    @Then("validates if the order was not completed")
    public void validates_if_the_order_was_not_completed() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new CheckoutPageFour(driver).checkout_validacao_erro();

        Assert.assertEquals("Ooops! O pagamento do seu pedido não foi autorizado. Por favor, confira os dados ou utilize outro cartão e tente novamente.\n" +
                "Se o erro persistir, entre em contato com a administradora do seu cartão.", "Ooops! O pagamento do seu pedido não foi autorizado. Por favor, confira os dados ou utilize outro cartão e tente novamente.\n" +
                "Se o erro persistir, entre em contato com a administradora do seu cartão.");

    }


    @After
    public void tearDown() throws InterruptedException {

        Thread.sleep(5000);
        this.driver.quit();

    }
}
