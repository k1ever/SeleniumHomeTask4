package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by vbalaban on 2/23/2015.
 */
public class BaseTest {

    protected static WebDriver driver;
        public LoginPage loginPage = PageFactory.initElements(getCurrentDriver(), LoginPage.class);
//    public static LoginPage loginPage = new LoginPage(getCurrentDriver());
    public static NewPostPage newPostPage = new NewPostPage(getCurrentDriver());
    public static PostViewPage postViewPage = new PostViewPage(getCurrentDriver());
    public static PostsPage postsPage = new PostsPage(getCurrentDriver());
    public static AllPostsPage allPostsPage = new AllPostsPage(getCurrentDriver());


    protected static WebDriver getCurrentDriver() {
        if (driver == null) {
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        }
        return driver;
    }

    @BeforeTest
    public void SetUp(){
        loginPage.Open();
        driver.manage().window().maximize();
        loginPage.ProvideUserName();
        loginPage.ProvidePassword();
        loginPage.ClickOnLoginButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

//    @AfterTest
//    public void TearDown(){
//        driver.quit();
//    }
}