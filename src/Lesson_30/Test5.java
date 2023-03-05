package Lesson_30;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test5 {


    static StringBuilder abc(){
        StringBuilder a = new StringBuilder("privet");
        try {
            File f = new File("test2.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e){
            e.getStackTrace();
            System.out.println("a в cath блоке = " + a);
            return a;
        }

        finally {
            a.append(" !!! ");
            System.out.println("a в finally блоке = " + a);



        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println(abc());

    }
}


// в блоке cath создается копия a* возвращаемого значения, то есть просто еще одна сслыка
// на объект, а вот сам объект вполне уже может поменяться в блоке
// finally
