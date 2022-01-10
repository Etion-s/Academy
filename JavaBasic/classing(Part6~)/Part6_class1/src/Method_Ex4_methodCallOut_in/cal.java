package Method_Ex4_methodCallOut_in;

public class cal {
    int plus (int x, int y){
        return x+y;
    }

    double avg (int x, int y){
        double sum = plus(x,y);
        return  sum/2;
    }

    void execute() {
        double result = avg(7,10);
        System.out.println("Result: "+ result);
    }



}
