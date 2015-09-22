package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class WebdriverExtension {

    protected static WebDriver driver;

    public WebdriverExtension(WebDriver driver) {
        this.driver = driver;
    }

    protected static void MoveMouseOverElement(By element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(element)).perform();
    }

    protected static void MoveMouseOverElementAndClick(By element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(element)).click().perform();
    }

    public static boolean isElementContainsText(By by, String text)
    {
        try {
            return driver.findElement(by).getText().contains(text);
        } catch (NullPointerException e) {
            return false;
        }
    }
}