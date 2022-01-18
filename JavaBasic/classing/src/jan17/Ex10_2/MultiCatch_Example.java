package jan17.Ex10_2;

public class MultiCatch_Example {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int v1 = Integer.parseInt(data1);
            int v2 = Integer.parseInt(data2);
            int result = v1 + v2;
            System.out.println(result);
        } catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("매개값 부족 or 숫자변환 x");
        } catch (Exception e) {
            System.out.println("알 수없는 오류 발생");
        }finally {
            System.out.println("다시 실행 오네가이시마스");
        }
    }
}
