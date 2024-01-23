
public class TrialExam
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TrialExam
     */
    public TrialExam()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    class Item{
        public Item(String s){}
    }
    // wie viele können maximal zu einem Zeitpunkt "leben"? -> variablen zählen
    // wie viele werden erzeugt
    Item inMyHand;
    public void howManyObjects(){
        Item i1,i2,i3;
        i1 = new Item("Magic wand");
        i2 = new Item("Golden key");
        i3 = new Item("Energy drink");

        inMyHand = i3;

        // Position A
        // instances with references: 3
        // variables : 4
        
        i3 = new Item("Silver button");
        i1 = new Item("Bronze statue");

        // Position B
        // instances created: 5
        // instances with references: 4
        // i1: "Bronze statue"
        // i2: "Golden key"
        // i3: "Silver button"
        // inMyHand: "Energy Drink" 
        
        
        // variables : 4 (obere Grenze live instances)
    }
    // Position C

}
