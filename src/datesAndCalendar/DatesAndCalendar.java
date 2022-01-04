package datesAndCalendar;

import java.util.Calendar;
import java.util.Date;

public class DatesAndCalendar {
    public static void main(String[] args) {

        DatesAndCalendar.displayCurrentDate();
        displaySetDate();

    }
    private static void displayCurrentDate () {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Date date = new Date();
        calendar.setTime(date);
        System.out.println(calendar.getTime()); //Sat Dec 18 04:21:18 EST 2021
    }

    private static void displaySetDate () {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2031, 02, 30);
        Date date = calendar.getTime();
        System.out.println(date); //Sun Mar 30 04:21:18 EDT 2031
    }
}
