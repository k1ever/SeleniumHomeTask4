package Lesson3;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PostViewPage;

import static core.WebdriverExtension.isElementContainsText;

/**
* Created by vbalaban on 2/23/2015.
*/

public class CreatePost extends BaseTest{


    @Test
    public void createPost(){

        newPostPage.Open();
        newPostPage.ProvidePostTitle("Test text for Presentation");
        newPostPage.ProvidePostBody("Test Body text for presentation");
        newPostPage.ClickOnPublishButon();
        newPostPage.ClickOnViewPostLink();
        Assert.assertTrue(isElementContainsText(PostViewPage.PostTitle, "Test text for Presentation"));
    }

}
