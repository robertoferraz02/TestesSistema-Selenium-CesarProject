package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


//Para testar a funcionalidade ou cenário desejado, informar o Step e a(s) respectiva(s) tag(s) abaixo. Exemplo: glue = "stepsLogin", tags = "@Login"

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "stepsLogin", tags = "@Login")
public class Runner {

}
