package jan18;

public class Throws_Example {
    public static void main(String[] args) throws ClassNotFoundException{
        findClass();
    }

    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
}
