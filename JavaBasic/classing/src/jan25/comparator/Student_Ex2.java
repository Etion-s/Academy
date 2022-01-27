package jan25.comparator;

public class Student_Ex2 {
    public static void main(String[] args) {
        Student s1 = new Student(11, 2);
        Student s2 = new Student(11, 8);

        int check = s1.compare(s1,s2);
        if (check>0){
            System.out.println("s1 > s2");
        } else if (check <0) {
            System.out.println("s1 < s2");
        }
        else{
            System.out.println("s1 = s2");
        }

    }
}
