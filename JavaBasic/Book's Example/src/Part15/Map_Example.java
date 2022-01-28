package Part15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Example {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("blue", 1);
        map.put("hong", 2);
        map.put("red", 3);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Map.Entry<String, Integer>> EntrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : EntrySet){
            if (entry.getValue() > maxScore){
                name = entry.getKey();
                maxScore = entry.getValue();
            }
            totalScore += entry.getValue();
        }
        int avgScore = totalScore/map.size();
        System.out.println("평균점수: "+avgScore);
        System.out.println("최고점수: "+maxScore);
        System.out.println("최고점수 이름: "+name);
    }
}
