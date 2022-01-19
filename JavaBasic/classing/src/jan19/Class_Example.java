package jan19;

public class Class_Example {
    public static void main(String[] args) {
        Car car = new Car();
        Class clazz1 = car.getClass();
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName());


        try{
            Class clazz2 = Class.forName("sec22.ex1.Car");
            System.out.println(clazz2.getName());
            System.out.println(clazz2.getSimpleName());
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

