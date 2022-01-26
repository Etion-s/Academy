package jan25;
import java.util.*;

public class ArrayList_Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servle/JSP");
        list.add(2,"Database");
        list.add("IBATIS");



        int size = list.size();
        System.out.println(size);

        String skill = list.get(2);
        System.out.println(skill);

        System.out.println();

        for (String i : list){
            System.out.println(i);
        }

        list.remove(2);
        System.out.println("================");

        String found = list.get(2);
        System.out.println(found);

        for (String i : list){
            System.out.println(i);
        }
    }
}
