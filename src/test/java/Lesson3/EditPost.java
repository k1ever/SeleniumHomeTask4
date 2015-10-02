package Lesson3;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PostViewPage;

import java.util.Date;

import static core.WebdriverExtension.isElementContainsText;

/**
 * Created by svoitenko on 02 Oct 2015.
 */
public class EditPost extends BaseTest {

    @Test
    public void editPost(){

        allPostsPage.Open();
        allPostsPage.EditPost();

        Date date = new Date();
        allPostsPage.ProvideEditedPostTitle("Edited at " + date.toString() + " Test text for Presentation");
        allPostsPage.ProvideEditedPostBody("Edited at " + date.toString() + " Test Body text for Presentation");
        allPostsPage.ClickOnPublishButon();
        allPostsPage.ClickOnViewPostLink();
        Assert.assertTrue(isElementContainsText(PostViewPage.PostTitle, date.toString()));

    }

}
