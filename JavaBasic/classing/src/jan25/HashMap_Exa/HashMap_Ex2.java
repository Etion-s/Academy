package jan25.HashMap_Exa;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Ex2 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        // 학번과 이름이 동일한 Student를 키로 저장
        map.put(new Student(1,"홍길동"), 95);
        map.put(new Student(1,"홍길동"), 95);

        System.out.println("총 Entry 수: "+map.size()); // 1
    }
}
