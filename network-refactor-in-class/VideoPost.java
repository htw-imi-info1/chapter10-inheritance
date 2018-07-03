
public class VideoPost extends Post
{
    String videoFile;
    public VideoPost(String username, String videoFile){
        super(username);
        this.videoFile = videoFile;
    }
    public String displaySpecificStuff(){
        return "videoFile: "+videoFile+"\n";
    }
}
