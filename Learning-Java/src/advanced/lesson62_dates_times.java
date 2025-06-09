package advanced;

import java.time.LocalDateTime;

public class lesson62_dates_times {
    public static void main(String[] args){

        // How to work with DATES & TIMES using java
        // (LocalDAte, LocalTime, LocalDateTime, UTC timestamp)

        LocalDateTime date1 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        if (date1.isBefore(date2)){
            System.out.println(date1 + " is earlier than " + date2);
        }
        else if (date1.isAfter(date2)){
            System.out.println(date1 + " is later than " + date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 + " is equal to " + date2);
        }
    }
}
