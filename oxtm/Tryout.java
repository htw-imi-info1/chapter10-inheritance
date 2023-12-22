public class Tryout
{
    public static void main(String[] a){
        O o = new O();
        M m = new M();
        T t = new T();
        X x = new X();
        
        
        m = t;
        m = x;
        o = t;
        /* these should not compile
        o = m;
        o = x;
        x = o;
        */



        
        
    }
}