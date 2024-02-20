package com.saucelabs.stepdefinitions;

import com.saucelabs.tasks.AddProduct;
import com.saucelabs.tasks.Login;
import com.saucelabs.tasks.Proceed;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.saucelabs.userinterfaces.CheckoutCompletePage.LBL_CHECKOUT_COMPLETE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyProductStepDefinition {

    @Given("that {word} signed-in demo app")
    public void thatUserSignedInSwagLabsApp(String actor) {
        theActorCalled(actor).attemptsTo(Login.atMyDemoApp());
    }

    @When("he buys the product {string}")
    public void heBuysTheProduct(String product) {
        theActorInTheSpotlight().attemptsTo(
                AddProduct.toCart(product),
                Proceed.toCheckout());
    }

    @Then("He should see the message {string}")
    public void heShouldSeeTheMessage(String message) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LBL_CHECKOUT_COMPLETE).text().contains(message));

    }


}
