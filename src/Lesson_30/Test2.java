package Lesson_30;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {

    void abc() {
        File f = new File("test1.txt"); // не проверяет наличие файла

        //всегда один
        try {
            FileInputStream fs = new FileInputStream(f);
            fs.read();
            System.out.println("later code");
        }
        // может быть несколько
        catch (FileNotFoundException e) {
            System.out.println("");
            System.out.println("exception : " + e);
        }

        catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }


    public static void main(String[] args) {

        Test2 t2 = new Test2();
        t2.abc();

    }

}
