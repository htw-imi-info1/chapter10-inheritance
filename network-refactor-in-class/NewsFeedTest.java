import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class NewsFeedTest.
 *
 * @author  Barne Kleinen
 */
public class NewsFeedTest
{
    private NewsFeed newsFeed1;
    MessagePost messagePost;
    PhotoPost photoPost ;
    String feed ;

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
    @BeforeEach
    public void setUp()
    {
        newsFeed1 = new NewsFeed();
        messagePost = new MessagePost("Känguru", "halt mal kurz");
        messagePost.like();
        messagePost.like();
        messagePost.addComment("message comment 1");
        newsFeed1.addMessagePost(messagePost);
        photoPost = new PhotoPost("Känguru", "pfote.jpg", "Die Pfote");
        photoPost.like();
        photoPost.addComment("photo comment 1");
        photoPost.addComment("photo comment 2");
        newsFeed1.addPhotoPost(photoPost);
        
        feed = newsFeed1.getFeed();
    }

    @Test
    public void testMessage()
    {
        assertTrue(feed.contains("Känguru"),"author is missing");
        assertTrue(feed.contains("halt mal kurz"),"message is missing");
    }

    @Test
    public void testPhoto()
    {
        assertTrue(feed.contains("Känguru"), "author is missing");
        assertTrue(feed.contains("pfote.jpg"), "file is missing");
        assertTrue(feed.contains("Die Pfote"), "caption is missing");
    }

    @Test 
    public void testMessageLikes(){
        assertTrue(feed.contains("2 people like this."), "message likes are not shown");
    }

    @Test 
    public void testPhotoLikes(){
        assertTrue(feed.contains("1 people like this."), "photo likes are not shown");
    }

    @Test 
    public void testPhotoComments(){
        assertTrue(feed.contains("2 comment(s). Click here to view."), "photo comments are not shown");
    }

    @Test 
    public void testMessageComments(){
        assertTrue(feed.contains("1 comment(s). Click here to view."), "message comments are not shown");
    }

}

