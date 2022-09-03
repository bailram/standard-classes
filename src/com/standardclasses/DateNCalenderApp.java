package com.standardclasses;

import java.util.Calendar;
import java.util.Date;

public class DateNCalenderApp {
    public static void main(String[] args) {
        /**
         * untuk create date, cara yang direkomendasikan itu pakai millisecond.
         * atau bisa dibilang untuk date ini tidak bisa diubah
         */
        Date tanggal = new Date();
        System.out.println(tanggal);
        System.out.println();
        var tanggal1 = new Date(1647983430000L); // harusnya akan pasti jadi Wed Mar 23 04:10:30 WIB 2022
        System.out.println(tanggal1);
        System.out.println();

        /**
         * kalau pingin ubah tanggal lebih enak pakai calender
         */
        var calender = Calendar.getInstance();
        System.out.println(calender.getTime()); // harusnya dapat tanggal hari ini
        System.out.println();
        // contoh merubah tanggal
        var calend = Calendar.getInstance();
        calend.set(Calendar.YEAR, 2000);
        calend.set(Calendar.MONTH, Calendar.JANUARY);
        calend.set(Calendar.DAY_OF_MONTH, 3);
        calend.set(Calendar.HOUR_OF_DAY, 0);
        calend.set(Calendar.MINUTE, 0);
        calend.set(Calendar.SECOND, 0);
        calend.set(Calendar.MILLISECOND, 0);
        System.out.println(calend.getTime());

    }
}
