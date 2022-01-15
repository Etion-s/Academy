package OOPTest.Ex14;

public class Ex14_UseFor {
    public static void main(String[] args) {
        String star = "*";
        int count = 1;

        for (int i=0; i<5 ; i++){
            for (int j=0; j<count; j++){
                System.out.print(star);
            }
            count++;
            System.out.println();
        }
    }
}
