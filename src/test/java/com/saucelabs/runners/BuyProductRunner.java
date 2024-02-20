package com.saucelabs.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buy_product.feature",
        glue = "com.saucelabs.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class BuyProductRunner {
}
