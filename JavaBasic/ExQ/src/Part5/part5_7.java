// 주어진 배열에서 최대값 구해보기
package Part5;

public class part5_7 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1,5,3,8,2};

        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max); //8
    }
}
