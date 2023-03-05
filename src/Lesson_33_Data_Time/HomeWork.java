package Lesson_33_Data_Time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.*;

public class HomeWork {

    public static void change (LocalDateTime ldt1, LocalDateTime ldt2, Period p1, Duration d1){

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("YYYY, MMMM - dd !! hh:mm");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");

        while (ldt1.isBefore(ldt2)){

            System.out.print("Работаем с " + ldt1.format(dtf1));
            ldt1 = ldt1.plus(p1);
            System.out.println(" до "+ ldt1.format(dtf1));

            System.out.print("Отдыхаем с "+ ldt1.format(dtf2));
            ldt1 = ldt1.plus(d1);
            System.out.println(" до "+ ldt1.format(dtf2));




        }



    };



    public static void main(String[] args) {



        LocalDateTime ldt1 = LocalDateTime.of(2020, 9, 1, 8, 00);
        LocalDateTime ldt2 = LocalDateTime.of(2021, 5, 31, 17, 00);
        Period p1 =Period.of(0, 1, 0);
        Duration d1 = Duration.ofHours(8);

        change(ldt1, ldt2, p1, d1);





    }




}
