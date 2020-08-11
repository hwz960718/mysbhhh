package com.hwz.mysbhhh.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * @author hwz
 * @date 2020/7/28
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse("2020-7-25 00:00:56");
        System.out.println(getWeekOfDate(new Date()));
//        System.out.println(getWeekOfDate(parse));
    }

    private static Integer getWeekOfDate(Date date){
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        System.out.println(dayOfWeek.getValue()+"-------------------------");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_WEEK);

    }
}
