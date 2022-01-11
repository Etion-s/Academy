package Part6_10_3_initStaticBlock;

public class Tv {
    static String company = "Samsung";
    static String model = "LCD";
    static String info;

    static {
        info = company + " " + model;
    }
}
