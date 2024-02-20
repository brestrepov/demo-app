package com.saucelabs.tasks;

import com.saucelabs.interactions.HideKeyboard;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucelabs.userinterfaces.CheckoutPage.BTN_PAYMENT;
import static com.saucelabs.userinterfaces.CheckoutPage.BTN_PLACE_ORDER;
import static com.saucelabs.userinterfaces.CheckoutPage.BTN_REVIEW_ORDER;
import static com.saucelabs.userinterfaces.CheckoutPage.LBL_CARD_NUMBER;
import static com.saucelabs.userinterfaces.CheckoutPage.LBL_CITY;
import static com.saucelabs.userinterfaces.CheckoutPage.TXT_ADDRESS_1;
import static com.saucelabs.userinterfaces.CheckoutPage.TXT_CARD_NUMBER;
import static com.saucelabs.userinterfaces.CheckoutPage.TXT_CITY;
import static com.saucelabs.userinterfaces.CheckoutPage.TXT_COUNTRY;
import static com.saucelabs.userinterfaces.CheckoutPage.TXT_EXPIRATION_DATE;
import static com.saucelabs.userinterfaces.CheckoutPage.TXT_FULL_NAME;
import static com.saucelabs.userinterfaces.CheckoutPage.TXT_SECURITY_CODE;
import static com.saucelabs.userinterfaces.CheckoutPage.TXT_STATE;
import static com.saucelabs.userinterfaces.CheckoutPage.TXT_ZIP_CODE;

public class Proceed {
    public static Performable toCheckout() {
        return Task.where(
                Enter.theValue("Brahian Restrepo").into(TXT_FULL_NAME),
                Enter.theValue("Calle 10").into(TXT_ADDRESS_1),
                Enter.theValue("Medellin").into(TXT_CITY),HideKeyboard.inIOS(LBL_CITY),
                Enter.theValue("Ant").into(TXT_STATE),HideKeyboard.inIOS(LBL_CITY),
                Enter.theValue("0000").into(TXT_ZIP_CODE),HideKeyboard.inIOS(LBL_CITY),
                Enter.theValue("COL").into(TXT_COUNTRY),HideKeyboard.inIOS(LBL_CITY),
                Click.on(BTN_PAYMENT),

                Enter.theValue("Brahian Restrepo").into(TXT_FULL_NAME),
                Enter.theValue("3256325632563256").into(TXT_CARD_NUMBER),HideKeyboard.inIOS(LBL_CARD_NUMBER),
                Enter.theValue("1025").into(TXT_EXPIRATION_DATE),HideKeyboard.inIOS(LBL_CARD_NUMBER),
                Enter.theValue("123").into(TXT_SECURITY_CODE),HideKeyboard.inIOS(LBL_CARD_NUMBER),
                Click.on(BTN_REVIEW_ORDER),
                Click.on(BTN_REVIEW_ORDER),
                Click.on(BTN_PLACE_ORDER)
        );
    }
}
