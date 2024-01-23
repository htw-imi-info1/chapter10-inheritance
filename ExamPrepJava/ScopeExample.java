
public class ScopeExample
{
    String aField = "i am a field";
   
    public String aMethod(String aParameter){
        String localVariable = "i am a local Variable";
        String result = localVariable + " " + aParameter;
        return result;
    }
    public String anotherMethod(){
        // String result = localVariable;
        String result = "";
        for(int i = 0;i<10;i++){
            result += i;
        }
        //result += i;
        return result;
    }
    public void setAField(String newValue){
        aField = newValue;
    }
    
    public static void main(String[] args){
        // 
        ScopeExample e1 = new ScopeExample();
        ScopeExample e2 = new ScopeExample();
        
        e1 = new ScopeExample();
        
        // how many instances have been created,
        // 3! (news zählen)
        // how many are still "alive" - references from variables
        // lifetime
        // 2
        
        e1.setAField("bla");
        int a = 3;
        //a.x(); int cannot be dereferenced
        
    }
}
