package Lesson_30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test6 {

    static FileInputStream fs1, fs2;

    public static void main(String[] args) {
        try {
            fs1 = new FileInputStream("test.txt");
            System.out.println("ok");
            try {fs2.close();}
            catch (IOException e) {e.getStackTrace();}
        }
            catch (FileNotFoundException e){e.getStackTrace();}
            catch (NullPointerException e){e.getStackTrace(); System.out.println("NullPointerException");}




        }
    }


    // exception переходил от одного cath к другому, пока самый внешний его не обработал





