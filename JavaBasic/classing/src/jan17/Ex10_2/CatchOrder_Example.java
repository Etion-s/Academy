package jan17.Ex10_2;

public class CatchOrder_Example {
    public static void main(String[] args) {
        try{
            String data1 = args[0];
            String data2 = args[1];
            int v1 = Integer.parseInt(data1);
            int v2 = Integer.parseInt(data2);
            int result = v1 + v2;
            System.out.println(result);
        } catch(Exception e){
            System.out.println("실행 매개값의 수가 부족");
        } /*catch (ArrayIndexOutOfBoundsException e) {

        }*/
    }
}
