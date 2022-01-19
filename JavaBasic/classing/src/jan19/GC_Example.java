package jan19;

public class GC_Example {
    public static void main(String[] args) {
        Employee emp;

        emp = new Employee(1);
        emp = null;
        emp = new Employee(2);
        emp = null;
        emp = new Employee(3);

        System.out.println("최종적 참조번호: " + emp.eno);
        System.gc();
    }

}

class Employee {
    public int eno;
    public Employee(int eno) {
        this.eno = eno;
        System.out.println(eno + "가 메모리에 생성됨");
    }

    @Override
    public void finalize() {
        System.out.println(eno + "가 메모리에서 제거됨");
    }
}
