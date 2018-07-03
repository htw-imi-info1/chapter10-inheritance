
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
    @Before
    public void setUp()
    {
        newsFeed1 = new NewsFeed();

        messagePost = new MessagePost("Känguru", "halt mal");
        messagePost.like();
        messagePost.like();
        messagePost.addComment("message comment 1");
        newsFeed1.addPost(messagePost);

        photoPost = new PhotoPost("Känguru", "pfote.jpg", "Die Pfote");
        photoPost.like();
        photoPost.addComment("photo comment 1");
        photoPost.addComment("photo comment 2");
        newsFeed1.addPost(photoPost);

        VideoPost videoPost = new VideoPost("Marc-Uwe", "film.mp4");
        videoPost.like();
        videoPost.like();
        videoPost.like();
        newsFeed1.addPost(videoPost);

        feed = newsFeed1.getFeed();
    }
    @Test
    public void testMessage()
    {
        assertTrue("author is missing",feed.contains("Känguru"));
        assertTrue("message is missing",feed.contains("halt mal"));
    }

    @Test
    public void testPhoto()
    {
        assertTrue("author is missing",feed.contains("Känguru"));
        assertTrue("file is missing",feed.contains("pfote.jpg"));
        assertTrue("caption is missing",feed.contains("Die Pfote"));
    }

    @Test 
    public void testMessageLikes(){
        assertTrue("message likes are not shown",feed.contains("2 people like this."));
    }

    @Test 
    public void testPhotoLikes(){
        assertTrue("photo likes are not shown",feed.contains("1 people like this."));
    }

    @Test 
    public void testPhotoComments(){
        assertTrue("photo comments are not shown",feed.contains("2 comment(s). Click here to view."));
    }

    @Test 
    public void testMessageComments(){
        assertTrue("message comments are not shown",feed.contains("1 comment(s). Click here to view."));
    }

}

