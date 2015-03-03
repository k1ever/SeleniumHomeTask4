package pageObjects;

import core.ApplicationSettings;
import core.WebdriverExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by vbalaban on 2/23/2015.
 */
public class LoginPage extends WebdriverExtension{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    protected By usernameTextbox = By.id("user_login");
    protected By passwordTextbox = By.id("user_pass");
    protected By loginButton = By.id("wp-submit");

    @Override
    public void Open() {
        driver.navigate().to(ApplicationSettings.baseUrl);
    }

    public void ProvideUserName() {
        driver.findElement(usernameTextbox).sendKeys(ApplicationSettings.username);
    }

    public void ProvidePassword() {
        driver.findElement(passwordTextbox).sendKeys(ApplicationSettings.password);
    }

    public void ClickOnLoginButton() {
        driver.findElement(loginButton).click();
    }
}
