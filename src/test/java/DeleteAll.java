import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PostsPage;

import static core.WebdriverExtension.isTextPresentOnPage;

/**
 * Created by vbalaban on 3/3/2015.
 */
public class DeleteAll  extends BaseTest {


    @Test
    public void DeleteAllPosts() {
        PostsPage.AllPosts.Select();
        PostsPage.TitleCheckbox.Check();
        PostsPage.ActionDropDownMenu.SelectDropDownValue("trash");
        PostsPage.ApplyButton.Click();

        Assert.assertTrue(isTextPresentOnPage("No posts found."));
    }
}
