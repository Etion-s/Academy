package jan06.TeacherEx2;
//1 + (1+2) + (1+2+3+) + ... + (1+2+3+...+10)의 결과를 계산하시오.
public class TeaherEx2_7 {
    public static void main(String[] args) {
        int end=2, total_sum=0;
        while(true){
            if(end>11){
                break;
            }

            int while_sum=0;
            for (int i=1; i<end; i++){
                while_sum += i;
            }
            total_sum += while_sum;
            end++;
        }
        System.out.println(total_sum);
    }
}
