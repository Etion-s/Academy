package jan25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Example {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("유동혁",1);
        map.put("박갱핸",2);
        map.put("박차니",3);
        map.put("김상철",4);

        System.out.println("총 수: "+map.size());

        // 객체 찾기
        System.out.println("유동혁: "+map.get("유동혁"));
        System.out.println();

        // 객체를 하나씩 처리
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " "+value);
        }
        System.out.println();

    }
}
