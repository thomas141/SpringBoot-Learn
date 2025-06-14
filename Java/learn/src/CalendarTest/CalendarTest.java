package CalendarTest;
import java.time.*;

public class CalendarTest {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        System.out.println("Today is: " + date);
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        System.out.println("Month: " + month);
        System.out.println("today: " + date);


        date = date.minusDays(today-1);
        System.out.println("The first day of this month is: " + date);

        DayOfWeek weekday = date.getDayOfWeek();
        System.out.println("Weekday is: " + weekday);
        int value = weekday.getValue();
        System.out.println("Weekday value is: " + value);

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1;i<value;i++){
            System.out.print("    "); //would not go to next line
        }

        while(date.getMonthValue() == month){
            System.out.printf("%3d", date.getDayOfMonth());
            if(date.getDayOfMonth() == today){
                System.out.print("*"); //print a * mark as today
            }else
                System.out.print(" "); //print a " " if not today
            date = date.plusDays(1); //plus one day
            if(date.getDayOfWeek().getValue() == 1){
                System.out.println(); //if next day is monday next line
            }
        }
        if(date.getDayOfWeek().getValue()!=1)
            System.out.println();



    }
}
