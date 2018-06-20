
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NewsFeedTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NewsFeedTest
{
    private NewsFeed newsFeed1;
    MessagePost messagePost;
    PhotoPost photoPost ;

    /**
     * Default constructor for test class NewsFeedTest
     */
    public NewsFeedTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        newsFeed1 = new NewsFeed();
        messagePost = new MessagePost("Känguru", "halt mal");
        photoPost = new PhotoPost("Känguru", "pfote.jpg", "Die Pfote");

    }

    @Test
    public void testCreateAndShow()
    {
        newsFeed1.addMessagePost(messagePost);
        newsFeed1.show();
        newsFeed1.addPhotoPost(photoPost);
        newsFeed1.show();
    }
}

