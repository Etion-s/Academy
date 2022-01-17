package jan17.Ex95_1;

public class Anonymous {
    // 필드에 익명 자식 객체 생성
    // 부모객체를 생성 할때 익명으로 자식객체가 있다고 가정하고 사용
    Insect spider1 = new Insect() {
        String name = "무당거미";
        void cobweb() {
            System.out.println("사각형으로 거미줄을 친다.");
        }

        @Override
        void attack() {
            System.out.println(name + ": 독을 발사");
        }
    };

    // 로컬변수의 초기 값으로 대입
    // 메소드를 사용하면서 내부의 로컬변수에 익명자식객체를 사용용
   void method1() {
        Insect spider2 = new Insect() {
            String name = "늑대거미";
            void cobweb() {
                System.out.println("육각수로 거미줄을 친다");
            }

            @Override
            void attack() {
                System.out.println(name + ": 앞니로 문다.");
            }
        };
        spider2.attack();
    }

    // 로컬변수이기 때문에 메서드에서 바로 사용용
   void method2(Insect insect){
        insect.attack();
    }
}
