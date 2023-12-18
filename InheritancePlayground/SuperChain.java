
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SuperChain
{
    @Test
    public void testOneSuperCall(){
        B b = new B();
        assertEquals("AB",b.nameChain());
    
    }  
    
    @Test
    public void testTwoSuperCall(){
        D d = new D();
        assertEquals("ADD",d.nameChain());
    }  
    
      
    @Test
    public void testTwoSuperCallDynamic(){
        A d = new D();
        assertEquals("ADD",d.nameChain());
    }  
}
