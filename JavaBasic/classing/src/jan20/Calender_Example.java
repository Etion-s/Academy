package jan20;

import java.util.Calendar;

public class Calender_Example {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int week = now.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;
        switch (week){
            case Calendar.MONDAY:
                strWeek = "월";
                break;
            case Calendar.TUESDAY:
                strWeek = "ghk";
                break;
            case Calendar.WEDNESDAY:
                strWeek = "tn";break;
            case Calendar.THURSDAY:
                strWeek = "ahr";break;
            case Calendar.FRIDAY:
                strWeek = "rma";break;
            case Calendar.SATURDAY:
                strWeek = "xh";break;
            default:
                strWeek = "dlf";break;
        }
        System.out.println(strWeek);
    }
}
