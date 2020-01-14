
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SuperChain
{
    @Test
    public void testOneSuperCall(){
        C c = new C();
        assertEquals("",c.nameChain());
    
    }  
    
    @Test
    public void testTwoSuperCall(){
        A e = new E();
        assertEquals("",e.nameChain());
    
    }  
}
