
public class Post
{
    private String username;  // username of the post's author

    public Post(String author){
        username = author;
    }

    public String display()
    {
        String result = "";
        result += username;
        return result;
    } 
}
