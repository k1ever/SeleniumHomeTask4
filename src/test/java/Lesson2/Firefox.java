package Lesson2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by vbalaban on 9/13/2015.
 */
public class Firefox {

    @Test
    public void testFirebug() throws Exception {
        File file = new File("C:\\firebug-2.0.12-fx.xpi");
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.addExtension(file);
        firefoxProfile.setPreference("extensions.firebug.currentVersion", "2.0.12"); // Avoid startup screen
        firefoxProfile.setPreference("extensions.firebug.showStackTrace", true);
        firefoxProfile.setPreference("extensions.firebug.delayLoad", false);
        firefoxProfile.setPreference("extensions.firebug.showFirstRunPage", false);
        firefoxProfile.setPreference("extensions.firebug.allPagesActivation", "on");
        firefoxProfile.setPreference("extensions.firebug.console.enableSites", true);
        firefoxProfile.setPreference("extensions.firebug.defaultPanelName", "console");

        WebDriver driver = new FirefoxDriver(firefoxProfile);

    }
}
