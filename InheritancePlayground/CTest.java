

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CTest
{
    /**
     * Default constructor for test class CTest
     */
    public CTest()
    {
    }

    @Test
    public void testOneSuperCall(){
        C c = new C();
        assertEquals("AC",c.nameChain());
    
    }  
    
    @Test
    public void testTwoSuperCall(){
        A e = new E();
        assertEquals("ACE",e.nameChain());
    
    }  
}
