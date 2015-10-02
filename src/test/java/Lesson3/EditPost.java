package Lesson3;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PostViewPage;

import static core.WebdriverExtension.isElementContainsText;

/**
 * Created by svoitenko on 02 Oct 2015.
 */
public class EditPost extends BaseTest {

    @Test
    public void editPost(){

        allPostsPage.Open();
        allPostsPage.EditPost();
        allPostsPage.ProvideEditedPostTitle("Edited Test text for Presentation");
        allPostsPage.ProvideEditedPostBody("Edited Test Body text for presentation");
        allPostsPage.ClickOnPublishButon();
        newPostPage.ClickOnViewPostLink();
        Assert.assertTrue(isElementContainsText(PostViewPage.PostTitle, "Edited"));

    }

}
