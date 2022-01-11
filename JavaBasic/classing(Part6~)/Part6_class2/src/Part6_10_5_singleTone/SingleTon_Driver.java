package Part6_10_5_singleTone;

public class SingleTon_Driver {
    public static void main(String[] args) {
        /*
        Singleton obj1 = new Singleton(); // 앞에서 생성자를 private로 접근 제한
        Singleton obj1 = new Singleton(); // 따라서 외부에서 호출 불가
        */

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2){
            System.out.println("Same Adress");
            System.out.println(obj1);
            System.out.println(obj2);
        } else{
            System.out.println("Diff Adress");
            System.out.println(obj1);
            System.out.println(obj2);
        }

    }
}
