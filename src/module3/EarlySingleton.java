package module3;

public class EarlySingleton {

    private static EarlySingleton singleton = new EarlySingleton();

    private EarlySingleton(){

        System.out.println("early instantiation will be created at loading of class");
    }

    public static EarlySingleton getInstance(){

        return singleton;
    }
}
