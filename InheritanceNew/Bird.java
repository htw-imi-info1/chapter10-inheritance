
public class Bird extends Animal

{
    /** this is implied if no constructor is defined 
    public Bird(){
    super();
    }
     */

    public Bird(){
        super("some Bird");
    }

    public Bird(String d){
        super(d);
    }
    
    public String makeSound(){
        return "chilp";
    }
}
