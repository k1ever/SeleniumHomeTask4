package pageObjects;

import core.ApplicationSettings;
import core.WebdriverExtension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vbalaban on 2/23/2015.
 */
public class LoginPage extends WebdriverExtension {

    @FindBy(id = "user_login")
    public WebElement usernameTextbox;

    @FindBy(id = "user_pass")
    public WebElement passwordTextbox;

    @FindBy(id = "wp-submit")
    public WebElement loginButton;

//    protected By usernameTextbox = By.id("user_login");
//    protected By passwordTextbox = By.id("user_pass");
//    protected By loginButton = By.id("wp-submit");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void Open() {
        driver.navigate().to(ApplicationSettings.baseUrl);
    }

    public void ProvideUserName() {
//        driver.findElement(usernameTextbox).sendKeys(ApplicationSettings.username);
        usernameTextbox.sendKeys(ApplicationSettings.username);
    }

    public void ProvidePassword() {
//        driver.findElement(passwordTextbox).sendKeys(ApplicationSettings.password);
        passwordTextbox.sendKeys(ApplicationSettings.password);
    }

    public void ClickOnLoginButton() {
//        driver.findElement(loginButton).click();
        loginButton.click();
    }

}