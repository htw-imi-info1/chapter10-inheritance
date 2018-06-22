
public class A
{
    protected String theField;
    
    public A(){
       theField = "Constructor in A";
    }
    public String getTheField(){ return theField;}
    public String getName(){
        return "getName in A";
    }

    public String nameChain(){
        return "A";
    }
}
