import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate date1InLocalDate = LocalDate.parse(date1);
        LocalDate date2InLocalDate = LocalDate.parse(date2);

        int daysDifference = (int)ChronoUnit.DAYS.between(date1InLocalDate, date2InLocalDate);

        return Math.abs(daysDifference);
    }
}