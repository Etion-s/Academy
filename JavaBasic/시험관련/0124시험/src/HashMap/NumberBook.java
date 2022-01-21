package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class NumberBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<String, String>();
        System.out.println("전화번호 저장하기");
        System.out.println("총 사용자수 입력");

        int num;
        String name, number;

        num = sc.nextInt();

        for (int i=0; i<num; i++){
            System.out.print("사용자이름입력: ");
            name = sc.next();
            System.out.print("전화번호 입력: ");
            number = sc.next();

            map.put(name,number);
        }
        System.out.println("저장완료");
        System.out.println();
        System.out.println("검색하기");

        while(true){
            System.out.print("검색할 이름 입력: ");
            name = sc.next();

            if (name.equals("stop")){
                break;
            }

            number = map.get(name);
            if (number == null){
                System.out.println("입력하신 사용자는 없습니다");
            } else {
                System.out.println(name+ "씨의 전화번호: "+number);
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
