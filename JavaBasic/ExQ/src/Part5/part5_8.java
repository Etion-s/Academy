// 주어진 배열의 전체 항목의 합과 평균값(for중첩문이용)
package Part5;

public class part5_8 {
    public static void main(String[] args) {
        part5_8 p58 = new part5_8(); // 객체 생성 연습
        int[][] array = {
                {95, 86},
                {83,92,96},
                {78,83,93,87,88}
        };
        int sum=0, count=0;
        double avg=0.0;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                sum += array[i][j];
                count++;
            }
        }
        avg = sum/count;
        System.out.println("총합: "+ sum);
        System.out.println("평균: " + avg);
    }
}
