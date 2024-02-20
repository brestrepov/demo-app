package com.saucelabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {

    public static Target LBL_PRODUCT = Target.the("").locatedForAndroid(AppiumBy.xpath("//android.widget.TextView[@text='Sauce Labs Backpack']")).locatedForIOS(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Sauce Labs Backpack'`]"));
    public static Target BTN_ADD_CART = Target.the("").located(AppiumBy.accessibilityId("Add To Cart button"));
    public static Target BTN_OPEN_CART = Target.the("").locatedForAndroid(AppiumBy.accessibilityId("cart badge")).locatedForIOS(AppiumBy.accessibilityId("tab bar option cart"));
    public static Target BTN_PROCEED_CHECKOUT = Target.the("").located(AppiumBy.accessibilityId("Proceed To Checkout button"));
}
