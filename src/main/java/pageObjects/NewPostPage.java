package pageObjects;

import core.WebdriverExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by vbalaban on 2/23/2015.
 */
public class NewPostPage extends WebdriverExtension {

    public NewPostPage(WebDriver driver) {
        super(driver);
    }

    protected By postTitle = By.id("title");
    protected By PostsMenu = By.id("menu-posts");
    protected By AddNewSubMenu = By.xpath("//a[text()='Add New']");

    public void Open() {
        MoveMouseOverElement(PostsMenu);
        MoveMouseOverElementAndClick(AddNewSubMenu);
    }

    public void ProvidePostTitle(String text) {
        driver.findElement(postTitle).sendKeys(text);
    }

    public void ProvidePostBody(String text){
        driver.switchTo().frame("content_ifr");
        driver.switchTo().activeElement().sendKeys(text);
        driver.switchTo().defaultContent();
    }

    public void ClickOnPublishButon() {
        //waitForElementEnabled(By.id("publish"));
        driver.findElement(By.id("publish")).click();
    }

    public void ClickOnViewPostLink(){
        driver.findElement(By.linkText("View post")).click();
    }

}