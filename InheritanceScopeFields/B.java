
public class B extends A
{
    String fieldInB = "fieldInB";
    public String nameChain(){
        return super.nameChain()+getClass().getName();
    }
}
