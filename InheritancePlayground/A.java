
public class A
{
    public String getName(){
        return "getName in A";
    }

    public String nameChain(){
        return "A";
    }

    public String template(){
        String result = "getName: ";
        result += getName();
        result +=" - nameChain: ";
        result += nameChain();
        return result;
    }
}
