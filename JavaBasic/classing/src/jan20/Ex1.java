package jan20;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex1 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        String now1 = now.toString();
        System.out.println(now1);

        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String now2 = sdf.format(now);
        System.out.println(now2);
    }
}
