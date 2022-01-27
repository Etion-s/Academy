package jan25.comparator;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    int age;
    int classNumber;

    public Student(int age, int classNumber){
        this.age = age;
        this.classNumber = classNumber;
    }


    @Override
    public int compare(Student o1, Student o2) {
        return o1.classNumber-o2.classNumber;
    }
}
