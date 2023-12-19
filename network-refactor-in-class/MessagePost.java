import java.util.ArrayList;

/**
 * This class stores information about a post in a social network. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.1
 */
public class MessagePost  extends Post 
{
    private String message;   // an arbitrarily long, multi-line message

    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param author    The username of the author of this post.
     * @param text      The text of this post.
     */
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
    }


    /**
     * Return the text of this post.
     * 
     * @return The post's text.
     */
    public String getText()
    {
        return message;
    }


    /**
     * Display the details of this post.
     * 
     * (Currently: Print to the text terminal. This is simulating display 
     * in a web browser for now.)
     */
    public String display()
    {
        String result = super.display();
        //result += username;
        
        
        
        result += message;
        result += displayPart2();
        return result;
        
    }

}
