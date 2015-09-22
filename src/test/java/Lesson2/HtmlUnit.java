package Lesson2;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

/**
 * Created by vbalaban on 9/13/2015.
 */
public class HtmlUnit {

    @Test
    public void testHtmlUnit() throws Exception {
        HtmlUnitDriver driver = new HtmlUnitDriver();
        driver.setJavascriptEnabled(true);
    }
}
