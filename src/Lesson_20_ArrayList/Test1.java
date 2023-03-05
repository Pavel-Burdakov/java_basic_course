package Lesson_20_ArrayList;

//ArrayList - массив, который может измеять свою дллину в нем элементы класса  object
// элементами массива типа данных object могут быть элементы
// любого ссылочного типа данных (разных)

// в ArrList могут быть только object, примитивных типов данных быть не может;

// но


import java.util.ArrayList;
class car{};
class  student{};
public class Test1  {



    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        car C1 = new car();
        student S1 = new student();
        list.add(C1);
        list.add(S1);

        list.add(new StringBuilder("ok"));

        // если нам нуно чтобы в листе были объекты только одного заданного типа
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Ok");

        // создает такой же но другой элемент
        ArrayList<String> list3= new ArrayList<>(list2);



        list2.add("Pen");

        for (String a: list2){

            System.out.println(a);

        }

        list2.add(1, "hallo");
        for (String a: list2){

            System.out.println(a);

        }

        ArrayList<String> list6 = new ArrayList<>();
        list6.add("oook");

        list2.addAll(list6);

        list2.addAll(1, list6);




        // Integer -  не примитвный, int нельзя примитивный
        ArrayList<Integer> list5 = new ArrayList<>();


        // получить элемент листа

        System.out.println(list2.get(1));
        for (int i = 0; i<list2.size(); i++){
            System.out.println(list2.get(i));

        }

        // заменить элемент

        list2.set(1, "!!!");
        for (String s: list2){
            System.out.println(s);

        }


        list2.remove(2);


        list2.remove("pen");

        list2.indexOf("Ok");
        list2.lastIndexOf("Ok");


        System.out.println(list2.toString());


        // убрать все элементы
        list2.clear();



    }



}
