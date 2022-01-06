public class DiceEx {
    public static void main(String[] args) {
        int check = 0;
        while(check != 1){
            int dice1 = (int)(Math.random()*6)+1;
            int dice2 = (int)(Math.random()*6)+1;

            if(dice1+dice2 == 5){
                check++;
            }
            System.out.println(dice1+" , "+dice2);
        }
    }
}
