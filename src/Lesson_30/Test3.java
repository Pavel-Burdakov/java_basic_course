package Lesson_30;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder("");
        try {
            File f = new File("test.txt");
            System.out.println("objekt file create");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("stream file create");
            int counter = 0;
            while (true){
                counter++;
                res.append(fis.read());
                System.out.println("info read");
                if (counter == 3){
                    fis.close();
                }
            }



        } catch (FileNotFoundException e){
            e.getMessage();
            e.getStackTrace();
            System.out.println("Exception 1");
        } catch (IOException e){
            e.getMessage();
            e.getStackTrace();
            System.out.println("Exception 2");

        } finally {
            System.out.println("This is finnaly");
        }



    }




}
