package Lesson_16_String;

class checkMail{

public void my_check(String mail){

   int cur = 0;
   int a=0;
   int b = 0;

   while (cur<mail.length()-1){
       a = mail.indexOf('@', cur);
       b = mail.indexOf('.', cur);
       cur = mail.indexOf(';', cur+1);
       System.out.println(mail.substring(a+1, b));

   }


}


}



public class HomeWork {

    public static void main (String[] Args){

        String data = "ya@yandex.ru; on@gmail.com; ona@mail.ru;";
        checkMail t1 = new checkMail();



        t1.my_check(data);

        System.out.println("Finish");




    }


}
