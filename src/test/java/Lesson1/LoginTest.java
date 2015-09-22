//package Lesson1;
//
//import core.ApplicationSettings;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//
//public class LoginTest {
//    protected static WebDriver driver;
//    @Test
//    public void Lesson1() {
//
//        driver = new FirefoxDriver();
//        driver.navigate().to(ApplicationSettings.baseUrl);
//        driver.findElement(By.id("user_login")).clear();
//        driver.findElement(By.id("user_login")).sendKeys("root");
//        driver.findElement(By.id("user_pass")).clear();
//        driver.findElement(By.id("user_pass")).sendKeys("Ovbu2003");
//        driver.findElement(By.id("wp-submit")).click();
//        driver.close();
//        driver.quit();
//    }
//}