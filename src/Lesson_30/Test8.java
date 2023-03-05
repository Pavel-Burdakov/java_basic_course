package Lesson_30;

import Lesson_16_String.Car;

import java.time.*;

public class Test8 {

    static void change_dezhurniy (LocalDate start, LocalDate finish, Period p){

        LocalDate data = start;
        while (data.isBefore(finish)){

            System.out.println("НАступила дата "+data+" пора менять дежурного");
            data = data.plus(p);

        }


    }


    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());


        car c = car.createCar();

        LocalDate ld1 = LocalDate.of(2000, 1, 1);
        LocalDate ld2 = LocalDate.of(2000, Month.JANUARY, 1);

        LocalTime lt1 = LocalTime.of(0, 1);

        LocalDateTime ldt1 = LocalDateTime.of(ld2, lt1);

        System.out.println(ldt1);


        // неизменяемый тип данных
        ld1.plusDays(5);
        LocalDate ld3 = ld1.plusDays(5);
        System.out.println(ld1);
        System.out.println(ld3);


        Period p = Period.ofMonths(1);
        Period p1 = Period.ofWeeks(2);
        Period p3 = Period.of(1,1,1);
        LocalDate start = LocalDate.of(2022, 9, 1);
        LocalDate finish = LocalDate.of(2023, 5, 31);


        change_dezhurniy(start, finish, p);





    }




}



class car{
    private car(){}
    static car createCar(){return new car();}
}
