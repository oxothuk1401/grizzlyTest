package by.griizly.levkovskii.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Created by oxothuk1401 on 20.01.2017.
 */
public class ConvertDate {
    public static String convertDate(String convertDate) {
        try{
            LocalDate date = LocalDate.parse(convertDate, DateTimeFormatter.ofPattern("MMM dd,yyyy", new Locale("en")));
            return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }catch (Exception e){
            return convertDate;
        }

    }
}
