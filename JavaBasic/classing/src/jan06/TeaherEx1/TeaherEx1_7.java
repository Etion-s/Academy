package jan06.TeaherEx1;
//정수 100~1까지 한 줄에 20개의 숫자를 나타내기
//(단, 5의 배수는 출력하지 않으면서 10의 배수는 출력해야한다.)

public class TeaherEx1_7 {
    public static void main(String[] args) {
        int i = 101, cnt = 0;
        do {
            i--;
            if (i%5==0 & i%10 != 0){
                continue;
            }
            System.out.println(i+"\t");
            cnt++;
            if (cnt == 20){
                System.out.println();
                cnt =0;
            }
            if (i==1){
                break;
            }
        } while(true);

    }
}
