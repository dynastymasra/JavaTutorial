package org.dynastymasra.javalearning.database.tot;

import java.sql.Date;
import java.util.Calendar;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class TestTime {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2014, Calendar.DECEMBER, 12);
        Long timePast = calendar.getTimeInMillis();
        Long time = System.currentTimeMillis();
        Long dif = time - timePast;

        System.out.println("Time : " + time);
        System.out.println("Long MAX : " + Long.MAX_VALUE);
        System.out.println("Double MAX : " + Double.MAX_VALUE);
        System.out.println("Float MAX : " + Float.MAX_VALUE);
    }
}
