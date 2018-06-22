import java.util.ArrayList;
/**

 */
public class Post
{
    ArrayList<String> comments;

    public Post(){
        comments = new ArrayList<>();
    }

    /**
     * Add a comment to this post.
     * 
     * @param text  The new comment to add.
     */
    public void addComment(String text)
    {
        comments.add(text);
    }
}
