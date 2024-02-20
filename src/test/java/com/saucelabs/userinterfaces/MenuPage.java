package com.saucelabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {

    public static Target BTN_MENU = Target.the("").locatedForAndroid(AppiumBy.accessibilityId("open menu")).locatedForIOS(AppiumBy.accessibilityId("tab bar option menu"));
    public static Target BTN_LOG_IN = Target.the("").located(AppiumBy.accessibilityId("menu item log in"));

}
