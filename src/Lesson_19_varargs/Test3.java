package Lesson_19_varargs;

public class Test3 {

    public static void main(String[] args) {

        int [][] arr = {{1,2,3}, {4,5}, {6, 7, 8, 9, 10, 11}};
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");

            }

            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println(" ");

        for (int i[] : arr){
            for (int  j : i) {
                System.out.print( j  + " ");

            }
            System.out.println(" ");

        }






    }

}
