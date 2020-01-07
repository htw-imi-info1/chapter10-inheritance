import java.util.ArrayList;

/**
 * This class stores information about a post in a social network. 
 * The main part of the post consists of a photo and a caption. 
 * Other data, such as author and time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.1
 */
public class PhotoPost extends Post
{
    private String filename;  // the name of the image file
    private String caption;   // a one line image caption

    private ArrayList<String> comments;

    /**
     * Constructor for objects of class PhotoPost.
     * 
     * @param author    The username of the author of this post.
     * @param filename  The filename of the image in this post.
     * @param caption   A caption for the image.
     */
    public PhotoPost(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
      
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

    /**
     * Return the file name of the image in this post.
     * 
     * @return The post's image file name.
     */
    public String getImageFile()
    {
        return filename;
    }

    /**
     * Return the caption of the image of this post.
     * 
     * @return The image's caption.
     */
    public String getCaption()
    {
        return caption;
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

        result += "  [" + filename + "]";
        result += "\n";
        result += "  " + caption;
        result += "\n";

        result += timeString();
     result += displayLikes();

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

}
