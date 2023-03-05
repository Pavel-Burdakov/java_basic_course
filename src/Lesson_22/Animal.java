package Lesson_22;

public class Animal {

    Animal() {
        System.out.println("I am animal");
    }

    protected int eyes;
    protected void eat(){
        System.out.println("Animal eat");
    }
    protected void drink(){
        System.out.println("Animal drink");
    }



}


class Pet extends Animal{

    Pet(){
        System.out.println("I am pet");
        eyes = 2;
    }

    protected String name;
    protected int tail = 1;
    protected int paw = 4;

    protected void runs(){
        System.out.println("Pets run");
    }

    protected void jump(){
        System.out.println("Pets jump");
    }




}

class Dog extends Pet{

    Dog(String name){
        this.name = name;
        System.out.println("I am dog and my name is " + name);


    }

    protected void play(){

        System.out.println("Dog play");

    }


}

class Cat extends Pet{

    Cat(String name){
        this.name = name;
        System.out.println("I am cat and my name is " + name);


    }

    protected void sleep(){

        System.out.println("Cat sleep");

    }


}

class test_zoo{

    public static void main(String[] args) {

        Dog D1 = new Dog("Elvis");
        System.out.println(D1.paw);

        Cat C1 = new Cat("Kisa");
        C1.sleep();

    }

}



