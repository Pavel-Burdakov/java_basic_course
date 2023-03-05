package Lesson_20_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class HW {

/* Метод авс принмает набор строк,
формируют из неповторящихся строк arraylist
сортирует
 */

    public static ArrayList<String> abc(String... S){

        ArrayList<String> result = new ArrayList<>();
        for (String a: S){
            if (!result.contains(a)) {
                result.add(a);
            }
        }

        Collections.sort(result);
        System.out.println(result);



        return result;

    }


    public static void main(String[] args) {

        ArrayList<String> test =
                new ArrayList<>();

        test = abc("privet", "abc", "abc", "hallp");


    }


}
