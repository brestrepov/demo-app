package com.saucelabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

    public static Target TXT_FULL_NAME = Target.the("").located(AppiumBy.accessibilityId("Full Name* input field"));
    public static Target TXT_ADDRESS_1 = Target.the("").located(AppiumBy.accessibilityId("Address Line 1* input field"));
    public static Target TXT_ADDRESS_2 = Target.the("").located(AppiumBy.accessibilityId("Address Line 2 input field"));
    public static Target LBL_CITY = Target.the("").locatedForAndroid(AppiumBy.xpath("//android.widget.TextView[@text='City*']")).locatedForIOS(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'City*'`]"));
    public static Target TXT_CITY = Target.the("").located(AppiumBy.accessibilityId("City* input field"));
    public static Target TXT_STATE = Target.the("").located(AppiumBy.accessibilityId("State/Region input field"));
    public static Target TXT_ZIP_CODE = Target.the("").located(AppiumBy.accessibilityId("Zip Code* input field"));
    public static Target TXT_COUNTRY = Target.the("").located(AppiumBy.accessibilityId("Country* input field"));
    public static Target BTN_PAYMENT = Target.the("").located(AppiumBy.accessibilityId("To Payment button"));
    public static Target LBL_CARD_NUMBER = Target.the("").locatedForAndroid(AppiumBy.xpath("//android.widget.TextView[@text='Card Number*']")).locatedForIOS(AppiumBy.accessibilityId("Card Number*"));
    public static Target TXT_CARD_NUMBER = Target.the("").located(AppiumBy.accessibilityId("Card Number* input field"));
    public static Target TXT_EXPIRATION_DATE = Target.the("").located(AppiumBy.accessibilityId("Expiration Date* input field"));
    public static Target TXT_SECURITY_CODE = Target.the("").located(AppiumBy.accessibilityId("Security Code* input field"));
    public static Target BTN_REVIEW_ORDER = Target.the("").located(AppiumBy.accessibilityId("Review Order button"));
    public static Target BTN_PLACE_ORDER = Target.the("").located(AppiumBy.accessibilityId("Place Order button"));

}
