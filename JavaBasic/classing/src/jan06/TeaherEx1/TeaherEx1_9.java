package jan06.TeaherEx1;
//1부터 100까지 홀수만 나오며 한 줄에 5개의 수로 나열 되어있도록 하기
public class TeaherEx1_9 {
    public static void main(String[] args) {
        int check_row=0, num=1;
        while(true){
            if (num>100){
                break;
            }
            while (true){
                if (check_row==5){
                    System.out.println();
                    check_row = 0;
                    break;
                }
                if (num%2==1){
                    if(num>100){
                        break;
                    }
                    System.out.print(num+" ");
                    num++;
                    check_row++;
                } else{
                    num++;
                }
            }
        }

    }
}
