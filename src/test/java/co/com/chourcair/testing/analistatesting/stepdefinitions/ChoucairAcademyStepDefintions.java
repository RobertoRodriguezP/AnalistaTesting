package co.com.chourcair.testing.analistatesting.stepdefinitions;

import  co.com.chourcair.testing.analistatesting.tasks.OpenUps;
import co.com.chourcair.testing.analistatesting.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^The user opens the page$")
    public void theUserOpensThePage() {
        System.out.print("Inicio la vaina");
        OnStage.theActorCalled("user").wasAbleTo(OpenUps.ThePage(), Register.OnThePage());
    }

    @When("^the user registers$")
    public void theUserRegisters() {

    }

    @Then("^the user login$")
    public void theUserLogin() {

    }
}
