package Lesson2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * Created by vbalaban on 9/13/2015.
 */
public class IE {

    @Test
    public void testIE() throws Exception {
        System.setProperty("webdriver.ie.driver", "C:\\projects\\WordPressAutomationTestNG\\src\\test\\java\\Lesson1\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
    }
}
