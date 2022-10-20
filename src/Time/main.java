package Time;
import java.sql.Time;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
public class main {

    public static void GoodMorning(){
        System.out.println();
        int TrueHourNow = LocalTime.now().getHour();
        int MinuteNow = LocalTime.now().getMinute();
        int HourNow;
        if (TrueHourNow >= 13){
            HourNow = TrueHourNow - 12;
        }
        else{
            HourNow = TrueHourNow;
        }
        String AmPm;
        if(TrueHourNow >= 12){
            AmPm = "PM";
        }
        else{
            AmPm = "AM";
        }
        String Name = "Fabio";

        if (TrueHourNow <= 11 && TrueHourNow >= 4){
            System.out.println("Good Morning " + Name + ", The time of day is " + HourNow + ":" + MinuteNow + AmPm);
        }
        else if(TrueHourNow >= 12 && TrueHourNow <= 19){
            System.out.println("Good Afternoon "+ Name + ", The time of day is " + HourNow + ":" + MinuteNow + AmPm);
        }
        else{
            System.out.println("Good Evening "+ Name + ", The time of day is " + HourNow + ":" + MinuteNow + AmPm);
        }

    }
    public static void date(){
        Month CurrentMonth = LocalDate.now().getMonth();
        int DayOfMonth = LocalDate.now().getDayOfMonth();
        int Year = LocalDate.now().getYear();
        System.out.println("It is " + LocalDate.now().getDayOfWeek() +", "+ CurrentMonth +" "+ DayOfMonth + " " + Year);
        System.out.println();
    }
    public static void news(){
        System.out.println("Here are your daily updates: ");
        System.out.println();

    }

    public static void main(String[] args){
        GoodMorning();
        date();
        news();

    }
}
