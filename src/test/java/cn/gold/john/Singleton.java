package cn.gold.john;

public class Singleton {
    private static Singleton ourInstance = null;

    public static synchronized Singleton getInstance() {
        if(ourInstance == null){
            ourInstance = new Singleton();
        }
        return ourInstance;
    }
}
