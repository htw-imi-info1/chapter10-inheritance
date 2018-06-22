import java.util.ArrayList;
/**

 */
public class Post
{
    private String username;  // username of the post's author
  
    ArrayList<String> comments;

    public Post(String username){
        this.username = username;
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

    public String displayUsername(){
        return username + "\n";
    }
}
