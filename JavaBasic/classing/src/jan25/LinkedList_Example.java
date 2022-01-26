package jan25;

import java.util.ArrayList;
import java.util.List;

public class LinkedList_Example {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");

        list1.add(1,"add");

        list1.remove(1);

        /*for (String i : list1) {
            System.out.println(i);
        }*/

    }
}
