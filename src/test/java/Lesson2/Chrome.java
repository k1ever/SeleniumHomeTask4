package Lesson2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by vbalaban on 9/13/2015.
 */
public class Chrome {

    @Test
    public void testChrome() throws Exception {
        System.setProperty("webdriver.chrome.driver", "Z:\\Projects\\Oliver Wyman\\OGRE\\Ogre.Automation.Tests\\bin\\Debug\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}
