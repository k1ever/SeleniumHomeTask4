package pageObjects;

import core.WebdriverExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by vbalaban on 2/23/2015.
 */
public class DashboardPage extends WebdriverExtension{

    protected By dashboardTitle = By.tagName("h2");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean IsOpened() {
        return waitForVisibleElement(dashboardTitle, 10).getText().equals("Dashboard");
    }

    @Override
    public void Open() {

    }
}
