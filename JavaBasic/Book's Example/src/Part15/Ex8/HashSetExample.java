package Part15.Ex8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student(1,"gg"));
        set.add(new Student(2,"aa"));
        set.add(new Student(1,"xx"));

        Iterator<Student> iterator = set.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.studentNum + " : "+student.name);
        }

    }
}
