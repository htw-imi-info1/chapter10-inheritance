
public class Assignments
{   M m; 
    X x;
    T t; 
    O o;
    public void valid(){
        m = t;
        m = x;
        o = t;
    }

    public void invalid(){
        o = m;
        o = x;
        x = o;
    }
}
