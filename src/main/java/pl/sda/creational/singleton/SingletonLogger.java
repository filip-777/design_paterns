package pl.sda.creational.singleton;

public class SingletonLogger {
    private static SingletonLogger instance;

    public void log (String log){
        System.out.println(log);
    }

    private SingletonLogger(){
    }

    public static SingletonLogger getInstance(){
        if(instance== null){
            instance = new SingletonLogger();
        }
        return instance;
    }
}
