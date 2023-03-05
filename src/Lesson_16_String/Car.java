package Lesson_16_String;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    final static int a=10;






        public static void main(String[] args) {
            System.out.println("Hallo");
            String s1 = new String("Good Day");

            String s2 = new String("Dog");
            String s3 = new String("Dog");

            System.out.println(s1 == s2);

            String s4 = "Cat";
            String s5 = "Cat";

            System.out.println(s4 == s5);

            String s10 = new String("OK");
            System.out.println("OK" == s10);

            int a = s1.length();
            System.out.print(a);



        }
    }








