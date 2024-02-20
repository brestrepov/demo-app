package com.saucelabs.interactions;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static io.appium.java_client.remote.MobilePlatform.IOS;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class HideKeyboard{
    public static Performable inIOS(Target target) {
        AppiumDriver driver = getProxiedDriver();
        String platform = driver.getCapabilities().getCapability(PLATFORM_NAME).toString();
        return Interaction.where("Hide keyboard",
                Check.whether(IOS.equalsIgnoreCase(platform))
                        .andIfSo(Click.on(target))
                );
    }
}
