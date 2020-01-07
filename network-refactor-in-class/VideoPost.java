

public class VideoPost extends Post
{
    String filename;
    public VideoPost(String author, String filename){
        super(author);
        this.filename = filename;
        
    }
    public String displayContent(){
        return "plays the video from file "+filename+"\n";
    }
}
