package Method_Ex3_return;

public class Car {
    //필드
    int gas;

    //생성자

    //메소드
    void setGas (int gas) {
        this.gas = gas;
    }

    boolean isLeftGas(){
        if(gas==0){
            System.out.println("NO GAS!!!!");
            return false;
        }
        System.out.println("HAVE GAS");
        return true;
    }

    void run() {
        while(true){
            if(gas>0){
                System.out.println("RUN (leftGas: "+gas+ ")");
                gas -= 1;
            } else {
                System.out.println("STOP");
                return; // 리턴 값이 void 일경우에 return만 가능
            }
        }
    }
}
