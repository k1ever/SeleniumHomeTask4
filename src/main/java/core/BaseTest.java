package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by vbalaban on 2/23/2015.
 */
public class BaseTest{

    protected static WebDriver driver;

    public LoginPage loginPage = new LoginPage(getCurrentDriver());
    public PostViewPage postViewPage = new PostViewPage(getCurrentDriver());
    //public LoginPage loginPage = PageFactory.initElements(getCurrentDriver(), LoginPage.class);

    public DashboardPage dashboardPage = new DashboardPage(getCurrentDriver());
    public NewPostPage newPostPage = new NewPostPage(getCurrentDriver());
    public PostsPage posts = new PostsPage(getCurrentDriver());

    protected static WebDriver getCurrentDriver() {
        if (driver == null) {
//            System.setProperty("webdriver.chrome.driver", "C:\\OGRE\\Ogre.Automation.Tests\\bin\\Debug\\chromedriver.exe");
//            driver = new ChromeDriver();
            driver = new FirefoxDriver();
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

    @AfterTest
    public void TearDown(){
        driver.quit();
    }
}
