import core.BaseTest;
import org.testng.annotations.Test;
import pageObjects.PostsPage;

/**
 * Created by vbalaban on 3/3/2015.
 */
public class EditPost  extends BaseTest {

    @Test
    public void EditPostTest(){
        PostsPage.AllPosts.Select();
        PostsPage.EditPost("Test text for Presentation");

    }
}
