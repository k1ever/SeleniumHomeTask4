package pageObjects;

import core.WebdriverExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by vbalaban on 3/2/2015.
 */
public class PostViewPage extends WebdriverExtension{
    public static By PostTitle = By.className("entry-title");
    public static By PostBody = By.className("entry-content");


    public PostViewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void Open() {

    }
}
