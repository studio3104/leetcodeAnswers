package com.studio3104.leetcode.Problems.p1360NumberOfDaysBetweenTwoDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public int daysBetweenDates(String date1, String date2) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date d1, d2;
        try {
            d1 = fmt.parse(date1);
            d2 = fmt.parse(date2);
        } catch (ParseException e) {
            throw new RuntimeException();
        }

        return (int) Math.abs((d1.getTime() - d2.getTime()) / (24 *  60 *  60 * 1000));
    }
}
