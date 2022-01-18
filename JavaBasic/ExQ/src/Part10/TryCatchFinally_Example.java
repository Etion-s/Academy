package Part10;

public class TryCatchFinally_Example {
    public static void main(String[] args) {
        String[] array = {"10", "3a"};
        int value = 0;

        for (int i=0; i<=2; i++){
            try{
                value = Integer.parseInt(array[i]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스 초과");

            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환 x");

            } finally {
                System.out.println(value);
            }
        }
    }
}
