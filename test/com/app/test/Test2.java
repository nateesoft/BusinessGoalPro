package com.app.test;

import java.util.Calendar;
import java.util.Locale;

public class Test2 {

    public static void main(String[] args) {
        Calendar car = Calendar.getInstance(Locale.ENGLISH);
        car.set(2018, 01, 01);
        
        int maxMonth = car.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(maxMonth);
    }
}
