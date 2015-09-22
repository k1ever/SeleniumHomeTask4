package Lesson3;

import core.BaseTest;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.NewPostPage;

/**
* Created by vbalaban on 2/23/2015.
*/

public class CreatePost_old extends BaseTest{
    public static LoginPage loginPage = new LoginPage(getCurrentDriver());
    public static NewPostPage newPostPage = new NewPostPage(getCurrentDriver());

    @Test
    public void createPost(){

        //login
        loginPage.Open();
        loginPage.ProvideUserName();
        loginPage.ProvidePassword();
        loginPage.ClickOnLoginButton();

        //new psot page
        newPostPage.Open();
        newPostPage.ProvidePostTitle("Test text for Presentation");
        newPostPage.ProvidePostBody("Test Body text for presentation");
        newPostPage.ClickOnPublishButon();
        newPostPage.ClickOnViewPostLink();

        //Assert.assertTrue(isElementContainsText(PostViewPage.PostTitle, "Test text for Presentation"));



    }

}
