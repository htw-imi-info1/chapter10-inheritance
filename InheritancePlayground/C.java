
public class C extends A
{
    public String getName(){
        return "getName in C";
    }
     public String nameChain(){
        return super.nameChain()+"C";
    }
}
