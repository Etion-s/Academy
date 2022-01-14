package Part7.Ex5;

public class Child extends Parent{
    private int studentNo;

    public Child(String name, int studentNo){
        super(name);
        this.studentNo = studentNo;
    }

    public int getStudentNo() {
        return studentNo;
    }

}
