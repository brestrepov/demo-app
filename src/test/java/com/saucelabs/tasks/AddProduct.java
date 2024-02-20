package com.saucelabs.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.saucelabs.userinterfaces.ProductsPage.BTN_ADD_CART;
import static com.saucelabs.userinterfaces.ProductsPage.BTN_OPEN_CART;
import static com.saucelabs.userinterfaces.ProductsPage.BTN_PROCEED_CHECKOUT;
import static com.saucelabs.userinterfaces.ProductsPage.LBL_PRODUCT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProduct {
    public static Performable toCart(String product) {
        return Task.where(
                WaitUntil.the(LBL_PRODUCT,isVisible()).forNoMoreThan(5).seconds(),
                Click.on(LBL_PRODUCT),
                Click.on(BTN_ADD_CART),
                Click.on(BTN_OPEN_CART),
                Click.on(BTN_PROCEED_CHECKOUT)
        );
    }
}
