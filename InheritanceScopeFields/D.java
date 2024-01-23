
public class D extends B
{
    String fieldInD = "fieldInD";
    public String nameChain(){
        return super.nameChain()+getClass().getName();
    }
    
    public String info(){
    
        return fieldInA+fieldInB+fieldInD;
    }
}
