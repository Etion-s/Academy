package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class NumberBook3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<String, String>();

        int num;
        String name, tel;
        System.out.print("총 사용자 수: ");
        num = sc.nextInt();

        for (int i=0; i<num; i++){
            System.out.print("Name: ");
            name = sc.next();
            System.out.print("Tell No: ");
            tel = sc.next();

            map.put(name,tel);
        }
        System.out.println(num+"명 저장완료");
        System.out.println("===============");
        System.out.println("검색시작");

        while (true){
            System.out.println("검색할이름: ");
            name = sc.next();

            if (name.equals("stop")){
                break;
            }

            tel = map.get(name);
            if (tel == null){
                System.out.println("No User");
            } else {

                System.out.println(name+"씨의 전화번호 : "+tel);
            }
        }
    }
}
