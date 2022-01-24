package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class NumberBook2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<String, String>();
        String name, number;

        System.out.print("총 사용자수 입력");
        int check = sc.nextInt();

        for (int i=0; i<check; i++){
            System.out.print("User Name: ");
            name = sc.next();
            System.out.println("User Phone: ");
            number = sc.next();

            map.put(name,number);
        }
        System.out.println("저장 완료");
        System.out.println("================");
        System.out.println("검색하기");

        while (true){
            System.out.println("검색할 이름:");
            name = sc.next();

            if (name.equals("stop")){
                break;
            }

            number = map.get(name);
            if (number == null){
                System.out.println("No user");
            } else{
                System.out.println(name + "의 전화번호: "+number);
            }
        }
        System.out.println("시스템을 종료합니다");
    }
}