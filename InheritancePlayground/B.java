
public class B extends A
{
    public String nameChain(){
        return super.nameChain()+getClass().getName();
    }
}
