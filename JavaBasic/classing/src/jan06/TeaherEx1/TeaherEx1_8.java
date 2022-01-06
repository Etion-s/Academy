package jan06.TeaherEx1;
//100부터 1까지 거꾸로 한 줄에 20개의 수가 나타나게 하기
public class TeaherEx1_8 {
    public static void main(String[] args) {
        boolean run = true;
        int num = 0, check=0;
        while(run){
            if (check == 5){
                break;
            }
            for(int i=0; i<20; i++){
                num++;
                System.out.print(num+" ");
            }
            System.out.println();
            check++;
        }
    }
}
