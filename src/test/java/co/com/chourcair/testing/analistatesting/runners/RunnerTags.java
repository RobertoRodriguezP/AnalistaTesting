package co.com.chourcair.testing.analistatesting.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/academyChoucair.feature",
        tags = "@stories",
        glue = "co.com.chourcair.testing.analistatesting.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
