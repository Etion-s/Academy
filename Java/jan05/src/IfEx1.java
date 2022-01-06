public class IfEx1 {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20) + 81; //점수를 만들기위함
        System.out.println("Score=" + score );
        String grade;

        if(score>=90){
            if (score>=95){
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if (score>=85){
                grade = "B+";
            } else {
                grade = "B";
            }
        }
        System.out.println("Grade:"+grade);
    }
}
