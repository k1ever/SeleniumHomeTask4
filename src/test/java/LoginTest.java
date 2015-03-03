import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by vbalaban on 2/23/2015.
 */


public class LoginTest extends BaseTest{

    @Test
    public void LoginTest() {
        Assert.assertTrue(dashboardPage.IsOpened(), "Cannot Login To the WordPress Main Page");
    }
}
