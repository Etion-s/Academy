package Part6.ExQ.Printer;

public class Printer_Example {
    public static void main(String[] args) {
        //Printer printer = new Printer();

        Printer_Example.printer(10);
        Printer_Example.printer(true);
        Printer_Example.printer(6.7);
        Printer_Example.printer("dbehdgur");

    }
    static void printer(int a){
        System.out.println(a);
    }
    static void printer(boolean a){
        System.out.println(a);
    }
    static void printer(double a){
        System.out.println(a);
    }
    static void printer(String a){
        System.out.println(a);
    }
}
