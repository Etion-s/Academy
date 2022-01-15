package Part7.Ex73;

public class Student extends People{
    public int studNo;

    public Student(String name, String ssn, int studNo){
        super(name, ssn);
        this.studNo = studNo;
    }
}
