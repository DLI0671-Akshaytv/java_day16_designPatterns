package Singleton_pattern;

public class Singleton {
    private static Singleton instance;
    Singleton(){}
    static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
