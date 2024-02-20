package com.saucelabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static Target TXT_USERNAME = Target.the("").located(AppiumBy.accessibilityId("Username input field"));
    public static Target TXT_PASSWORD = Target.the("").located(AppiumBy.accessibilityId("Password input field"));
    public static Target BTN_LOGIN = Target.the("").located(AppiumBy.accessibilityId("Login button"));

}
