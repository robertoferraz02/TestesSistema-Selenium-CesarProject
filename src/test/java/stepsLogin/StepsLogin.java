package stepsLogin;

import Pages.LoginPageOne;
import Pages.LoginPageThree;
import Pages.LoginPageTwo;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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

    @Given("user accesses the site")
    public void user_accesses_the_site() {

        driver.get("http://www.saraiva.com.br");
        driver.manage().window().maximize();

    }

    @Given("clicks to make login")
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

    @After
    public void tearDown() throws InterruptedException {

        Thread.sleep(5000);
        this.driver.quit();

    }

}
