package Lesson_30;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test4 {

    static int abc(){
        int a = 5;
        try {
            File f = new File("test2.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e){
            e.getStackTrace();
            System.out.println("a в cath блоке = " + a);
            return a;
        }

        finally {
            a=10;
            System.out.println("a в finally блоке = " + a);



        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println(abc());

    }

    // в случае с примитивным типом данных, создается копия a* возвращаемого значения и
    // оно возвращается,  блок finally меняет значение a но не а*
    // с референс типами следующий пример

}
