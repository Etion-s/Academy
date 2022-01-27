package jan25.CompareTo;

public class Student implements Comparable<Student>{
    int age;
    int classNumber;

    public Student(int age, int classNumber){
        this.age = age;
        this.classNumber = classNumber;
    }

    @Override
    public int compareTo(Student o) {
        if (this.age>o.age) {
            return 1;
        } else if (this.age == o.age){
            return 0;
        } else {
            return -1;
        }
    }
}
