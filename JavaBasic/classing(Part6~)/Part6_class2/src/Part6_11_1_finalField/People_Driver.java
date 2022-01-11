package Part6_11_1_finalField;

public class People_Driver {
    public static void main(String[] args) {
        People p1 = new People("111-222","Kim");
        People p2 = new People("333-444","Park");

        System.out.println(p1.nation + " " + p1.name+ " "+p1.ssn);
        System.out.println(p2.nation + " " + p2.name+ " "+p2.ssn);

        p1.name = "Change";
        System.out.println();
        System.out.println(p1.nation + " " + p1.name+ " "+p1.ssn);
    }
}
