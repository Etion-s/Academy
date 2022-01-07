//학생수와 점수입력 >최고 점수 및 평균 점수 구하기
package Part5;

import java.util.Scanner;

public class part5_9 {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner sc = new Scanner(System.in);

        while(run){
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = sc.nextInt();

            switch (selectNo){
                case 1:
                    System.out.print("학생 수:");
                    studentNum = sc.nextInt();
                    scores = new int[studentNum]; // 안하면 null에러 발생> 초기화값이 0 이므로 new를 이용해서 학생 수만큼 새롭게 초기화한다.
                    break;
                case 2:
                    System.out.println("현재학생수: "+ studentNum);
                    for(int i=0; i<studentNum; i++){
                        System.out.print("점수입력: ");
                        int inScore = sc.nextInt();
                        scores[i] = inScore; //이 줄위에 점수배열 초기화가 있었지만 값이 올바르게 저장되지 않는 상황 발생해서 위로 옮겼다.
                    }
                    break;
                case 3:
                    System.out.println("점수리스트");
                    for(int i=0; i<studentNum; i++){
                        System.out.print(scores[i]+ " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    int max = 0, sum =0;
                    double avg = 0.0;
                    for(int i=0; i<studentNum; i++){
                        if(max<scores[i]){
                            max = scores[i];
                        }
                    }
                    for(int i=0; i<studentNum; i++){
                        sum += scores[i];
                    }
                    avg = sum/studentNum;
                    System.out.println("최고점수: "+max);
                    System.out.println("평균점수: "+avg);
                    break;
                case 5:
                    run = false;
                    break;
            }


        }
    }
}
