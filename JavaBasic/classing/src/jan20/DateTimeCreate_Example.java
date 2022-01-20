package jan20;

import java.time.*;


public class DateTimeCreate_Example {
    public static void main(String[] args) throws InterruptedException{
        // 날짜 얻기
        LocalDate currDate = LocalDate.now();
        System.out.println(currDate);

        LocalTime currTime = LocalTime.now();
        System.out.println(currTime);

    }
}
