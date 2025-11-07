package OOP.Singleton;
import java.lang.reflect.Constructor;

//1). Private constructor → prevents direct instantiation.
//2). Static instance variable → holds the single instance of the class.
//3). Public static method → provides a global access point to get the instance.
class ABC {
    private static ABC abc;

    private ABC(){};

    public static ABC getAbc(){
        if(abc == null){
            synchronized (ABC.class){
                if(abc == null){
                    abc = new ABC();
                }
            }
        }
        return abc;
    }
}
public class Example {
    public static void main(String[] args) throws Exception{
        ABC abc1 = ABC.getAbc();
        System.out.println(abc1.hashCode());

        ABC abc2 = ABC.getAbc();
        System.out.println(abc2.hashCode());


//        "break singleton pattern...."
//        Constructor<ABC> constructor = ABC.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        ABC abc3 = constructor.newInstance();
//        System.out.println(abc3);
    }
}