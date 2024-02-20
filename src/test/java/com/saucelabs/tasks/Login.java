package com.saucelabs.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.saucelabs.userinterfaces.LoginPage.BTN_LOGIN;
import static com.saucelabs.userinterfaces.LoginPage.TXT_PASSWORD;
import static com.saucelabs.userinterfaces.LoginPage.TXT_USERNAME;
import static com.saucelabs.userinterfaces.MenuPage.BTN_LOG_IN;
import static com.saucelabs.userinterfaces.MenuPage.BTN_MENU;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Login {
    public static Task atMyDemoApp() {
        return Task.where(
                WaitUntil.the(BTN_MENU,isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_MENU),
                Click.on(BTN_LOG_IN),
                Enter.theValue("bob@example.com").into(TXT_USERNAME),
                Enter.theValue("10203040").into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }
}
