package Lesson_30;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test1 {



    public static void main(String[] args) throws Exception {
        File f = new File("test1.txt"); // не проверяет наличие файла

        //всегда один
        try {
            FileInputStream fis = new FileInputStream(f);
            fis.read();
            System.out.println("later code");
        }
        // может быть несколько
        catch (FileNotFoundException e){
            System.out.println("");
            System.out.println("exception : " + e);
        }




        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);

        try {
            int[] array = {4, 5, 6, 7};
            System.out.println(array[5]);
            System.out.println("bla-bla");
        }

        // лови, если выбросится ошибка ндекса массива, мы назовем ее e
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("exception : " + e);
        }

        // исполняется в любом случае  всегда один независимо от того было исключение или нет

        finally {
            System.out.println("finally code");


        }

        System.out.println("later code");


    }

}
