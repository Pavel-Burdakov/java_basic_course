package Lesson_19_varargs;

public class Test2<students> {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

        System.out.println("");


        // foreach a принимает поочередно все значения элементов массива

        for (int a : arr) {

            System.out.print(a + " ");

        }

        int sum = 0;
        for (int s : arr) {

            sum = sum + s;

        }

        System.out.println(sum);


        //

        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"filo", "matan"};


        for (String s1 : students) {
            for (String s2: exams){
                System.out.println(s1 + " " + s2);

            }

        }


    }

}
