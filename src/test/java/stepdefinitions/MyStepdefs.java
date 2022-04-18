package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.TablaDatosFeature;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.LoginPage;
import tasks.OpenPage;
import tasks.SearchFormBV;
import tasks.FillOutBV;

import java.util.List;

public class MyStepdefs {
    @Before
    public void inicair(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than IsaakOlaya wants to visit the colorlib page$")
    public void thanIsaakOlayaWantsToVisitTheColorlibPage() {
        OnStage.theActorCalled("Isaak").wasAbleTo(OpenPage.page() , LoginPage.page());
    }

    @When("^he enter to Block Validation F$")
    public void heEnterToBlockValidationF() {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchFormBV.formBV());
    }

    @And("^he fill out the BlockValidation F$")
    public void heFillOutTheBlockValidationF(List<TablaDatosFeature> tablaDatosFeatures) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillOutBV.FormBV(tablaDatosFeatures.get(0)));
    }

    @Then("^he validate the BlockValidation F$")
    public void heValidateTheBlockValidationF() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));
    }
}
