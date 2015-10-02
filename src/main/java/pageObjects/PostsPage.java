package pageObjects;

import core.WebdriverExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by vbalaban on 3/3/2015.
 */
public class PostsPage extends WebdriverExtension {
    public PostsPage(WebDriver driver) {
        super(driver);
    }

    public static void EditPost(String postName) {
        driver.findElement(By.xpath("//a[text()='" + postName + "']/ancestor::td//*[@class='edit']")).click();
    }

    public static class AllPosts {

        public static void Select() {

            MoveMouseOverElement(By.id("menu-posts"));
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); //too slow to appear for click
            MoveMouseOverElementAndClick(By.linkText("All Posts"));
        }
    }

    public static class ActionDropDownMenu {
        public static void SelectDropDownValue(String dropDownValue) {
            WebElement element = driver.findElement(By.id("bulk-action-selector-top"));
            Select select = new Select(element);
            select.selectByValue(dropDownValue);
        }
    }

    public static class TitleCheckbox {
        public static void Check() {

            driver.findElement(titleCheckbox).click();
        }
    }

    public static class ApplyButton {
        public static void Click() {
            driver.findElement(applyButton).click();
        }
    }

    public static By applyButton = By.id("doaction");
    static By titleCheckbox = By.id("cb-select-all-1");
}