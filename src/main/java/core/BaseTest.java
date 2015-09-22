package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by vbalaban on 2/23/2015.
 */
public class BaseTest {

    protected static WebDriver driver;

    protected static WebDriver getCurrentDriver() {
        if (driver == null) {
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        }
        return driver;
    }
}