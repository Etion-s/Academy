package jan14.Ex854_ParameterPolymorphism;

public class Taxi implements Vehicle{
    @Override
    public void run() {
        System.out.println("Taxi GO");
    }
}
