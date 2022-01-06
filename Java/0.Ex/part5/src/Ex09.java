//키보드로 학생수와 각 학생들의 점수를 입력 받아서 최고 점수 및 평균 점수를 구하는 프로그램
// 분석 : 최고점수 + 평균점수
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            switch (selectNo){
                case 1:
                    System.out.print("학생수입력: ");
                    studentNum = scanner.nextInt();
                    System.out.println("");
                    scores = new int[studentNum];
                    break;
                case 2:
                    for(int i=0; i<scores.length; i++){
                        System.out.print("점수입력: ");
                        scores[i] = scanner.nextInt();
                        System.out.println("");
                    }
                    break;
                case 3:
                    for(int i=0; i<scores.length; i++){
                        System.out.println(scores[i]);
                    }
                    break;
                case 4:
                    int max=0;
                    double avg =0.0;
                    for(int i=0; i< scores.length;i++){
                        if(max<scores[i]){
                            max = scores[i];
                        }
                    }
                    avg = max/ scores.length;
                    System.out.println("최고점수: " + max);
                    System.out.println("평균점수: " + avg);
                    break;
                case 5:
                    run = false;
            }
        }
        System.out.println("시스템을 종료합니다.");
    }
}
