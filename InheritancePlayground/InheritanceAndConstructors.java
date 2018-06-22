
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InheritanceAndConstructors
{
    /**
     * Default constructor for test class CTest
     */
    public InheritanceAndConstructors()
    {
    }

    @Test
    public void testConstructorInA(){
        A a = new A();
        assertEquals("Constructor in A",a.getTheField());
    }

    @Test
    public void testConstructorInC1(){
        C c = new C();
        assertEquals("Constructor in C",c.getTheField());
    }

    @Test
    public void testConstructorInC2(){
        A c = new C();
        assertEquals("Constructor in C",c.getTheField());
    }
}
