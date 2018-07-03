import java.util.ArrayList;
/**

 */
public class Post
{
    private String username;  // username of the post's author
    private long timestamp;
    private ArrayList<String> comments;
    private int likes;
    public Post(String username){
        this.username = username;
        comments = new ArrayList<>();
        timestamp = System.currentTimeMillis();
        likes = 0;
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

    public String displayComments(){
        String result = "";
        if(comments.isEmpty()) {
            result += "   No comments.";
            result += "\n";
        }
        else {
            result += "   " + comments.size() + " comment(s). Click here to view.";
            result += "\n";
        }

        return result;
    }

    /**
     * Create a string describing a time point in the past in terms 
     * relative to current time, such as "30 seconds ago" or "7 minutes ago".
     * Currently, only seconds and minutes are used for the string.
     * 
     * @param time  The time value to convert (in system milliseconds)
     * @return      A relative time string for the given time
     */

    public String timeString(long time)
    {
        long current = System.currentTimeMillis();
        long pastMillis = current - time;      // time passed in milliseconds
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        if(minutes > 0) {
            return minutes + " minutes ago";
        }
        else {
            return seconds + " seconds ago";
        }
    }

    /**
     * Return the time of creation of this post.
     * 
     * @return The post's creation time, as a system time value.
     */
    public long getTimeStamp()
    {
        return timestamp;
    }

    /**
     * Record one more 'Like' indication from a user.
     */
    public void like()
    {
        likes++;
    }

    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    public void unlike()
    {
        if (likes > 0) {
            likes--;
        }
    }

    public String displayLikes(){
        String result = "";
        if(likes > 0) 
            result += "  -  " + likes + " people like this.";
        result += "\n";
        return result;
    }

    public String display()
    {

        String result = "";
        result += displayUsername();

        result += displaySpecificStuff();

        result += timeString(getTimeStamp());
        result += displayLikes();
        result += displayComments();
        return result;
    }

    public String displaySpecificStuff(){
        return "";
    }
}
