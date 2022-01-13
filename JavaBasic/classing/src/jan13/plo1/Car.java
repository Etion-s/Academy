package jan13.plo1;

public class Car {
    Tire[] tires = {
            new Tire("앞왼쪽",6),
            new Tire("앞오른쪽", 2),
            new Tire("뒤왼쪽",3),
            new Tire("뒤오른쪽",4)
    };

    int run() { // Tire의 roll메소드 호출 > boolean타입으로 갈지 안갈지 리턴
        System.out.println("Car RUN"); // > 만약 못가면 Car객체에서 멈추는 명령, 그렇지않으면 계속 동작함
        for (int i=0; i< tires.length; i++) {
            if (tires[i].roll()==false){ // 1번 해석 참조
                stop();
                return(i+1);
            }
        }
        return 0;
    }

    void stop() {
        System.out.println("Car STOP");
    }
}
/*
* 1번해석
    if 안에 roll()가 있다. 이것은 ( )안에 있는 tires[i].roll()을 먼저 실행을 한다. 즉 false일 때만
    작동하는 것이 아니라, roll()을 계속 실행시키다가 if조건과 일치하면 그떄 if문 안의 내용을 실행한다
* */
