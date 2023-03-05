package Lesson_19_varargs;

// методу acb на вход передается неизвестное заранее количество массивов строк
// на выходе нужно получить массив который будет состоять из всех одномерныз массивов
// переданных на вход

public class HW {

    public static String[] abc(String[]... arr) {

        // определяем размер нового массива
        int len = 0;
        for (String[] a : arr){
            len += a.length;
        }

        String [] S1 = new String[len];

        int count = 0;

        for (String[] a : arr){
            for (String b: a){
                S1[count] = b;
                count++;
            }

        }


       return S1;


    }


    public static void main(String[] args) {

        String [] S1 = new String[] {"one", "pen", "dell"};
        String [] S2 = new String [] {"ball", "app", "hard", "book"};

        String [] res = abc(S1, S2);

        for (String a: res){
            System.out.println(a);
        }


    }


}
