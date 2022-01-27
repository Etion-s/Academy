package jan25.CompareTo;

public class Student_Ex {
    public static void main(String[] args) {
        Student a = new Student(11, 2);
        Student b = new Student(13, 1);

        int isBig = a.compareTo(b);

        if (isBig > 0){
            System.out.println("a > b");
        } else if (isBig < 0){
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }
}
