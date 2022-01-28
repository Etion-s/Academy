package Part15.Ex10;

import java.util.TreeSet;

public class TreeSet_Example {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(new Student("a",1));
        treeSet.add(new Student("b",2));
        treeSet.add(new Student("c",3));

        Student student = treeSet.last();

        System.out.println("최고점수: "+student.score);
        System.out.println("해당학생: "+student.id);
    }
}
