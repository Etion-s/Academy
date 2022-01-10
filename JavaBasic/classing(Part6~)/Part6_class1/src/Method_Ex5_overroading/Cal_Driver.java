package Method_Ex5_overroading;

public class Cal_Driver {
    public static void main(String[] args) {
        Cal cal = new Cal();

        double result1 = cal.areaRectangle(10);
        System.out.println("정사각형의 넓이"+result1);

        double result2 = cal.areaRectangle(10,20);
        System.out.println("정사각형의 넓이"+result2);
    }
}
