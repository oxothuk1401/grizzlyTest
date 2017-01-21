package by.griizly.levkovskii.util;

import java.util.Calendar;

public class GetDate {

    public static String lastMonthStart() {
        Calendar calendar = Calendar.getInstance();
        String lastMonth;
        int month;
        int year;
        int startMonth;
        month = calendar.get(Calendar.MONTH) + 1;
        if (month == 1) {
            year = calendar.get(Calendar.YEAR) - 1;
            month = calendar.get(Calendar.MONTH) + 12;
        } else {
            year = calendar.get(Calendar.YEAR);
        }
        startMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        return lastMonth = year + "-" + month + "-" + startMonth;
    }

    public static String lastMonthEnd() {
        Calendar calendar = Calendar.getInstance();
        String lastMonth;
        int month;
        int year;
        int endMonth;
        month = calendar.get(Calendar.MONTH) + 1;
        if (month == 1) {
            year = calendar.get(Calendar.YEAR) - 1;
            month = calendar.get(Calendar.MONTH) + 12;
        } else {
            year = calendar.get(Calendar.YEAR);
        }
        endMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastMonth = year + "-" + month + "-" + endMonth;
    }

    public static String lastYearStart() {
        Calendar calendar = Calendar.getInstance();
        String lastYear;
        int month;
        int year;
        int startMonth;
        year = calendar.get(Calendar.YEAR) - 1;
        month = calendar.getActualMinimum(Calendar.YEAR);
        startMonth = calendar.getActualMinimum(Calendar.DAY_OF_YEAR);
        return lastYear = year + "-" + month + "-" + startMonth;
    }

    public static String lastYearEnd() {
        Calendar calendar = Calendar.getInstance();
        String lastYear;
        int month;
        int year;
        int endMonth;
        year = calendar.get(Calendar.YEAR) - 1;
        month = calendar.getActualMaximum(Calendar.MONTH) + 1;
        endMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastYear = year + "-" + month + "-" + endMonth;
    }

    public static String curentYearToDateStart() {
        Calendar calendar = Calendar.getInstance();
        String curentYearToDate;
        int month;
        int year;
        int startMonth;
        year = calendar.get(Calendar.YEAR);
        month = calendar.getActualMinimum(Calendar.YEAR);
        startMonth = calendar.getActualMinimum(Calendar.DAY_OF_YEAR);
        return curentYearToDate = year + "-" + month + "-" + startMonth;
    }

    public static String curentYearToDateEnd() {
        Calendar calendar = Calendar.getInstance();
        String curentYearToDate;
        int month;
        int year;
        int endMonth;
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        endMonth = calendar.get(Calendar.DAY_OF_MONTH);
        return curentYearToDate = year + "-" + month + "-" + endMonth;
    }

    public static String curentMonthToDateStart() {
        Calendar calendar = Calendar.getInstance();
        String curentMonthToDate;
        int month;
        int year;
        int startMonth;
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        startMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        return curentMonthToDate = year + "-" + month + "-" + startMonth;
    }

    public static String curentMonthToDateEnd() {
        Calendar calendar = Calendar.getInstance();
        String curentMonthToDate;
        int month;
        int year;
        int endMonth;
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        endMonth = calendar.get(Calendar.DAY_OF_MONTH);
        return curentMonthToDate = year + "-" + month + "-" + endMonth;
    }

    public static String curentQtrToDateStart() {
        Calendar calendar = Calendar.getInstance();
        String curentQtrToDate;
        int month;
        int year;
        int startMonth;
        month = calendar.get(Calendar.MONTH) + 1;
        if (month < 4) {
            month = calendar.getActualMinimum(Calendar.MONTH) + 1;
        }else if (month < 7) {
            month = calendar.getActualMinimum(Calendar.MONTH) + 4;
        }else if (month < 10) {
            month = calendar.getActualMinimum(Calendar.MONTH) + 7;
        }else if (month <= 12) {
            month = calendar.getActualMinimum(Calendar.MONTH) + 10;
        }
        year = calendar.get(Calendar.YEAR);
        startMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        return curentQtrToDate = year + "-" + month + "-" + startMonth;
    }

    public static String curentQtrToDateEnd() {
        Calendar calendar = Calendar.getInstance();
        String curentQtrToDate;
        int month;
        int year;
        int endMonth;
        month = calendar.get(Calendar.MONTH) + 3;
        if (month < 7) {
            month = calendar.getActualMinimum(Calendar.MONTH) + 6;
        }else if (month < 10) {
            month = calendar.getActualMinimum(Calendar.MONTH) + 9;
        }else if (month <=12) {
            month = calendar.getActualMinimum(Calendar.MONTH) + 12;
        }
        year = calendar.get(Calendar.YEAR);
        endMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return curentQtrToDate = year + "-" + month + "-" + endMonth;
    }

    public static String lastQtrStart() {
        Calendar calendar = Calendar.getInstance();
        String lastQtr;
        int month;
        int year = Calendar.YEAR;
        int startMonth;
        month = calendar.get(Calendar.MONTH) + 1;
        if (month < 4) {
            month = calendar.get(Calendar.MONTH)+10;
            year = calendar.get(Calendar.YEAR)-1;
        }else if (month < 7) {
            month = calendar.getActualMinimum(Calendar.MONTH) + 1;
            year = calendar.get(Calendar.YEAR);
        }else if (month < 10) {
            month = calendar.getActualMinimum(Calendar.MONTH) + 4;
            year = calendar.get(Calendar.YEAR);
        }else if (month <= 12) {
            month = calendar.getActualMinimum(Calendar.MONTH) + 7;
            year = calendar.get(Calendar.YEAR);
        }
        startMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        return lastQtr = year + "-" + month + "-" + startMonth;
    }

    public static String lastQtrEnd() {
        Calendar calendar = Calendar.getInstance();
        String lastQtr;
        int month;
        int year = Calendar.YEAR;
        int endMonth;
        month = calendar.get(Calendar.MONTH) + 1;
        if (month < 4) {
            month = calendar.get(Calendar.MONTH)+12;
            year = calendar.get(Calendar.YEAR)-1;
        }else if (month < 7) {
            month = calendar.getActualMinimum(Calendar.MONTH) + 1;
            year = calendar.get(Calendar.YEAR);
        }else if (month < 10) {
            month = calendar.getActualMinimum(Calendar.MONTH) + 4;
            year = calendar.get(Calendar.YEAR);
        }else if (month <= 12) {
            month = calendar.getActualMinimum(Calendar.MONTH) + 7;
            year = calendar.get(Calendar.YEAR);
        }
        endMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastQtr = year + "-" + month + "-" + endMonth;
    }

}
