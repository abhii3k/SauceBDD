package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="",features="src/test/resources/Feature"
,glue="Stepdefination_sauce",
plugin= {"pretty","html:target/htmlreport.html"}
)
public class Runnersauce {

}
