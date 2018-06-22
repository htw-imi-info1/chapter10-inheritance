
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ATest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InheritanceTest
{
    /**
     * Default constructor for test class ATest
     */
    public InheritanceTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    @Test
    public void methodLookup1()
    {
        B b = new B();
        assertEquals("getName in A", b.getName());
    }

    @Test
    public void methodLookup2()
    {
        C c = new C();
        assertEquals("getName in C", c.getName());
    }

    @Test
    public void methodLookupMoreThanOneStep()
    {
        D d = new D();
        assertEquals("getName in A", d.getName());
    }
    
    @Test
    public void methodLookupMoreThanOneStep2()
    {
        E e = new E();
        assertEquals("getName in C", e.getName());
    }
    
    @Test
    public void methodLookUpStaticType()
    {
        A x; // A is the static type
        x = new B(); // B is the dynamic type
        x = new C(); // C is the dynamic
        assertEquals("getName in C", x.getName());
    }
    /*
    @Test
    public void methodLookupMoreThanOneStep()
    {
        D d = new D();
        assertEquals("getName in A", d.getName());
    }
    
    @Test
    public void methodLookupMoreThanOneStep()
    {
        D d = new D();
        assertEquals("getName in A", d.getName());
    }
    
    @Test
    public void methodLookupMoreThanOneStep()
    {
        D d = new D();
        assertEquals("getName in A", d.getName());
    }
    
    @Test
    public void methodLookupMoreThanOneStep()
    {
        D d = new D();
        assertEquals("getName in A", d.getName());
    }
    */
    

}

