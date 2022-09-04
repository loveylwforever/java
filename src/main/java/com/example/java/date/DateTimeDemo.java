package com.example.java.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// Java 日期时间
public class DateTimeDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(date));

        // 系统时间戳，通常用来计算耗时
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time consuming:" + (System.currentTimeMillis() - start) + "ms");

        Calendar calendar = Calendar.getInstance();
        System.out.println("当前年份：" + calendar.get(Calendar.YEAR));
        // Calendar 的月份是从 0 开始的，但日期和年份是从 1 开始的，所以获取月份记得要 +1
        System.out.println("当前月份：" + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("当前日期：" + calendar.get(Calendar.DATE));
        System.out.println("当前小时(12小时制)：" + calendar.get(Calendar.HOUR));
        System.out.println("当前小时(24小时制)：" + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("当前分钟：" + calendar.get(Calendar.MINUTE));
        System.out.println("当前秒数：" + calendar.get(Calendar.SECOND));
        // 判断是否为闰年
        System.out.println(new GregorianCalendar().isLeapYear(2022) == true ? "闰年" : "非闰年");
    }
}
