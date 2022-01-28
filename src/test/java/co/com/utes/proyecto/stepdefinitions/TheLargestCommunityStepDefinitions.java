package co.com.utes.proyecto.stepdefinitions;
import co.com.utes.proyecto.questions.Answer;
import co.com.utes.proyecto.tasks.Login;
import co.com.utes.proyecto.tasks.OpenUp;
import co.com.utes.proyecto.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;






public class TheLargestCommunityStepDefinitions {




    @Before
        public void setStage(){OnStage.setTheStage(new OnlineCast())  ;}
    @Given("^than Jesus wants to learn automation at the academy chourcair$")
    public void thanJesusWantsToLearnAutomationAtTheLargestCommunity() {

        OnStage.theActorCalled("Jesus").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));

    }

    @When("^he search for the City (.*) on the utest platform$")
    public void heSearchForTheCityPanamaOnTheutestPlatform(String City) {


        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(City));






    }


    @Then("^he finds the country the(.*)$")
    public void heFindsTheCountryThePanama(String question) {

     OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }















}
