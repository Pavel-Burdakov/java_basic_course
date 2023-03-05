package Lesson_28_example;


class Animal{

    static int a = 5;
    int b = 10;
    void abc() {System.out.println ("НЕ Статический метод из Animal");};
    static void def() {System.out.println ("Статический метод из Animal");};

}
class Tiger extends Animal{

    static int a = 25;
    int b = 30;
    void abc() {System.out.println ("НЕ Статический метод из Tiger");};
    static void def() {System.out.println ("Статический метод из Tiger");};

}



public class Test1 {

    public static void main(String[] args) {

        Animal an = new Tiger();

        System.out.println(an.a); // печатается переменная из родительского класса, т.к. an класса Animal определяется  compile time
        System.out.println(an.b); // печатается переменная из родительского класса, т.к. an класса Animal определяется  compile time
        an.abc(); // определяется run time вызывается из tiger, т.к. an ссылается на класс tiger
        an.def(); // метод статический и не требует создания объекта run time будет вызываться метод из animal т.к. an класса Animal


    }

}
