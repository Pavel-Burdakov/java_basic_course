package Lesson_18_Array;

import java.util.Arrays;

public class Test {

    public static void main (String[] Args){

        int [][] arr3 = {{1,2,3}, {-2,4,5}, {0,9,8}};

        System.out.println(arr3[1][2]);

        int[] array1 = new int[8];

        //динамическая инициализация
        String[] arr1;
        int[][] arr2;

        arr1 = new String[3];
        arr2 = new int[3][];

        for (int i = 0; i<arr1.length; i++){
            arr1[i] = "privet"+i;
            System.out.println(arr1[i]);
        }

        arr2[0] = new int[5];
        arr2[1] = new int[2];
        arr2[2] = new int[7];


        for (int i=0; i<arr2.length;i++){
            for (int j=0; j<arr2[i].length; j++){
                arr2[i][j] = i+j;
                System.out.println(arr2[i][j]);
            }
        }


        //смешанные варианты создания массивов

        int[] array4 = new int[7];
        int[] array5 = {1,2,3};
        int[] array6;
        array6 = new int[]{1,2,3};

        // так нельзя
        //int[] array1;
        //array1 = {1,2,3};


        int[] array7 = {8,4,3,-1,5,0,5,3};
        Arrays.sort(array7);
        for (int i=0; i<array7.length; i++){
            System.out.print(array7[i]);
        }

        //работает только с отстортированным массивом
        int index1 = Arrays.binarySearch(array7, 8 );
        System.out.println();
        System.out.println(index1);

        int[] array8 = {8,4,3,-1,5,0,5,3};
        for (int i = 0; i<array8.length; i++){
            System.out.print(array8[i]);
        }

        System.out.println();


        for (int i = 0; i<array8.length; i++){
            for (int j=i; j<array8.length; j++){
                if (array8[i]>array8[j]){
                        int tmp = array8[i];
                        array8[i]=array8[j];
                        array8[j]=tmp;
                }
            }
        }

        for (int i = 0; i<array8.length; i++){
            System.out.print(array8[i]);
        }











        }

}
