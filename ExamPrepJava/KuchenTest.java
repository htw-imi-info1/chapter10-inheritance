
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class KuchenTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KuchenTest
{
    private Kuchen kuchen1;

    /**
     * Default constructor for test class KuchenTest
     */
    public KuchenTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        kuchen1 = new Kuchen();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void test4()
    {
        java.lang.String string1 = kuchen1.teile(4);
        assertEquals("Jedes Studi bekommt 25 Hundertstel vom Kuchen", string1);
    }
    /**
     * negative or positive ? Could be both depending on 
     * wether zero is considered a valid input.
     */
    //@Ignore
    public void test0()
    {
        java.lang.String string1 = kuchen1.teile(0);
        assertEquals("Der ganze Kuchen bleibt übrig", string1);
    }

    /**
     * negative test: invalid input
     */
    @Test
    public void testX()
    {
        assert 0 == 0;
        java.lang.String string1 = kuchen1.teile(-3);
        assertEquals("Negative Anzahl von Studis macht keinen Sinn", string1);
    }
}

