
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDisplay
{
    /**
     * Default constructor for test class TestDisplay
     */
    public TestDisplay()
    {
    }

    @Test
    public void testA(){
        String expected = "getName: getName in A - nameChain: A";
        assertEquals(expected,new A().template());
    }
}
