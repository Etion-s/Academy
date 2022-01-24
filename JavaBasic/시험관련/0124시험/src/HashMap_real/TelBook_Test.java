// 유동혁_문항2
package HashMap_real;

import java.util.HashMap;
import java.util.Scanner;

public class TelBook_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        System.out.println("[전화번호 저장하기]");
        System.out.print("사용자 수 입력: ");
        int num = sc.nextInt();
        String name,tel;

        for (int i=0; i<num; i++){
            System.out.print("1.이름 입력 : ");
            name = sc.next();
            System.out.print("2.번호 입력 : ");
            tel = sc.next();

            map.put(name,tel);
        }
        System.out.println("저장완료!");
        System.out.println("[검색하기]");

        while (true){
            System.out.print("검색할 이름 입력 : ");
            name = sc.next();

            if (name.equals("stop")){
                break;
            }

            tel = map.get(name);
            if (tel == null){
                System.out.println("입력하신 이름은 존재하지 않습니다");
            } else {
                System.out.println("최명길씨의 번호는 "+tel+"입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다!");
    }
}
