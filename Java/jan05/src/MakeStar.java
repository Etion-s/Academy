// *문양 출력해보기
public class MakeStar {
    public static void main(String[] args) {
        String star = "*";
        int check = 1;
        for(int i=0; i<5; i++){
            for(int j=0; j<check; j++){
                System.out.print(star);
            }
            check++;
            System.out.println("");
        }
    }
}
/*
* for문 2개를 사용해서 하나는 줄을 바꾸는용 하나는 별을 출력하는용
* check라는 변수를 사용해서 별의 갯수를 계속 증가시켜주는게 포인트
* */
