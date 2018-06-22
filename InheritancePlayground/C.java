
public class C extends A
{
    public C(){
       theField = "Constructor in C";
    }
    public String getName(){
        return "getName in C";
    }
     public String nameChain(){
        return super.nameChain()+"C";
    }
}
