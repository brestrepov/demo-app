package com.saucelabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutCompletePage {

    public static final Target LBL_CHECKOUT_COMPLETE = Target.the("Title Checkout Complete").locatedForAndroid(AppiumBy.xpath("//android.widget.TextView[@text='Checkout Complete']"))
            .locatedForIOS(AppiumBy.accessibilityId("Checkout Complete"));

}
