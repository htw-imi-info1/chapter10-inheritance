
public class D extends B
{
    public String nameChain(){
        return super.nameChain()+getClass().getName();
    }
}
