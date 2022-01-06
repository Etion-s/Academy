// 중첩 for문을 사용 방정식의 해 구하기 (단 x,y는 10이하의 자연수)
public class ForEx3 {
    public static void main(String[] args) {
        for(int x=1; x<11; x++){
            for(int y=1; y<11; y++){
                if(4*x + 5*y == 60){
                    System.out.println(x+" "+y);
                }
            }
        }
    }
}
