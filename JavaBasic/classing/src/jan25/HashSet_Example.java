package jan25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Example {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("1"); // 동등객체 -> 저장 x

        /*for (String i : set){
            System.out.println(i);
        }

        System.out.println("---------");
        System.out.println(set.size());
        System.out.println("---------");*/

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);

            set.remove("2");
            set.remove("3");

            System.out.println("총개수: "+set.size());
        }
    }
}
