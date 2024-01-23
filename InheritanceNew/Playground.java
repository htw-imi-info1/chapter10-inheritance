
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Playground
{
    private Bird bird1;
    private Duck duck1;
    private Dog dog1;

    /**
     * Default constructor for test class Playground
     */
    public Playground()
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
        bird1 = new Bird();
        duck1 = new Duck();
        dog1 = new Dog("I am a dog");
    }

    @Test
    public void isAExample(){

        Duck duck = new Duck();
        Bird bird = duck; // a duck is-a bird

    }


    @Test
    public void testSounds()
    {
        assertEquals("wuff", dog1.makeSound());
        assertEquals("chilp", bird1.makeSound());
        assertEquals("quack", duck1.makeSound());
    }

    @Test
    public void testOverride()
    {
        assertEquals("chilp", bird1.makeSound());
        assertEquals("quack", duck1.makeSound());
        // Static class Bird
        // Dynamic class Duck
        Bird bird = new Duck();

        assertEquals("quack", bird.makeSound());

    }

    @Test
    public void testOverride2()
    {
        assertEquals("chilp", bird1.makeSound());
        assertEquals("quack", duck1.makeSound());
        // Static type: Bird
        // Dynamic type: Duck
        Bird bird = new BlueJay();

        assertEquals("chilp", bird.makeSound());

    }

    @Test
    public void variablePolymorphism()
    {   Bird bird; // polymorphic variable
        // bird can have many forms (polymorphism):
        bird = new BlueJay();
        assertEquals("chilp", bird.makeSound());
        bird = new Duck();
        assertEquals("quack", bird.makeSound());

    }


}
