package OOP.abst;

abstract class Super{
    public Super(){
        System.out.println("this class is super");
    }
    public void meth1(){
        System.out.println("meth1 of super");
    }
    abstract public void meth2();
}
class sub extends Super{
    public void meth2(){
        System.out.println("sub meth2");
    }
}
public class abst {
    public static void main(String[] args) {
        Super s = new sub();
        s.meth1();
        s.meth2();
    }
}
