package Lesson_17_StringBuilder;




public class Test1 {

    public boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        return s1.equals(s2);

    }

    public static void main(String[] Args){

        StringBuilder sb1 = new StringBuilder(""); // 16 вместимость по умолчанию
        StringBuilder sb2 = new StringBuilder(" ");

        Test1 t1 = new Test1() ;

        System.out.println(t1.ravenstvo(sb1, sb2));


    }
}
