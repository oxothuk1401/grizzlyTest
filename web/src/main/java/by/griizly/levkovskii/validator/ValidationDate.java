package by.griizly.levkovskii.validator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Created by oxothuk1401 on 20.01.2017.
 */
public class ValidationDate {
    public static boolean validationDate(String validDate) {
        try{
            LocalDate date = LocalDate.parse(validDate, DateTimeFormatter.ofPattern("MMM dd,yyyy", new Locale("en")));
            date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
