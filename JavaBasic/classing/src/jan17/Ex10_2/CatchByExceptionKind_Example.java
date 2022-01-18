package jan17.Ex10_2;

public class CatchByExceptionKind_Example {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int v1 = Integer.parseInt(data1);
            int v2 = Integer.parseInt(data2);
            int result = v1 + v2;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("실행값의 매개수 부족");
        } catch (NumberFormatException e){
            System.out.println("숫자로 변환 못함");
        } finally {
            System.out.println("다시 실행");
        }
    }
}
