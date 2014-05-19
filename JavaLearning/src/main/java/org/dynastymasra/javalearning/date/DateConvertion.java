package org.dynastymasra.javalearning.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class DateConvertion {

    private String date;

    public void dateConvertion(String data) {

        String[] dateFormat = {"dd-MM-yyyy", "yyyy-MM-dd", "dd/MM/yy"};
        SimpleDateFormat simpleDateFormatCurrent = new SimpleDateFormat(dateFormat[0]);
        SimpleDateFormat simpleDateFormatOne = new SimpleDateFormat(dateFormat[1]);
        SimpleDateFormat simpleDateFormatTwo = new SimpleDateFormat(dateFormat[2]);

        try {
            System.out.println("Date Format dd-MM-yyyy:" + data);

            date = simpleDateFormatOne.format(simpleDateFormatCurrent.parse(data));
            System.out.println("Date Format yyyy-MM-dd:" + date);

            date = simpleDateFormatTwo.format(simpleDateFormatCurrent.parse(data));
            System.out.println("Date Format dd/MM/yy:" + date);
        } catch (ParseException ex) {
            Logger.getLogger(DateConvertion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
