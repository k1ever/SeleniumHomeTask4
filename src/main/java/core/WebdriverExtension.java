package core;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class WebdriverExtension{

    protected static WebDriver driver;

    public WebdriverExtension(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void Open();

    public static boolean isElementPresent(WebDriver driver, By by) {
        try {
            driver.findElement(by);//if it does not find the element throw NoSuchElementException, which calls "catch(Exception)" and returns false;
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static boolean isElementContainsText(By by, String text)
    {
        try {
            return driver.findElement(by).getText().contains(text);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public static boolean isTextPresentOnPage(String text)
    {
        try {
            return driver.getPageSource().contains(text);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public static boolean isElementPresentAndDisplay(By by) {
        try {
            return driver.findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static boolean isElementEnabled(By by) {
        try {
            return driver.findElement(by).isEnabled();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void SelectValueFromDropDownMenu(By by, String valueName) {
        WebElement element = driver.findElement(by);
        Select select = new Select(element);
        select.selectByValue(valueName);
    }

    public WebElement waitForVisibleElement(final By by, int timeOutInSeconds) {
        WebElement element;
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));

            return element; //return the element
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public WebElement waitForClickableElement(final By by, int timeOutInSeconds) {
        WebElement element;
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
            element = wait.until(ExpectedConditions.elementToBeClickable(by));

            return element; //return the element
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void waitForElementEnabled(final By by) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return !driver.findElement(by).getAttribute("class").contains("disabled");
            }
        });
    }

    public Object ExecuteScript(WebDriver driver, String script) {
        return ((JavascriptExecutor)driver).executeScript(script);
    }

    protected static void MoveMouseOverElement(By element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(element)).perform();
    }

    protected static void MoveMouseOverElementAndClick(By element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(element)).click().perform();
    }
}


