package Lesson_27_Interface;

public abstract class Animal {

    Animal (){};

    Animal (String name){
        this.name = name;
    }

    String name;

    abstract void eat ();
    abstract void sleep();

}

abstract class Fish extends Animal{

    Fish(String name){
        super(name);
        this.name = name;
    }

    String name;
    void sleep(){
        System.out.println("Интересно наблюдать как спят рыбы");
    }

    abstract void swim();

}

abstract class Bird extends Animal implements speakable {
    Bird(String name){
        super(name);
        this.name = name;
    }

    abstract void fly();
    public void speak(){
        System.out.println(name + " Sings");
    };

}

abstract class Mammal extends Animal implements speakable{
    Mammal(String name){
        super(name);
        this.name = name;
    }
    abstract void run();

}

interface speakable{
    default void speak(){System.out.println("Somebody speaks");}
    //abstract void run();
}

class michenosec extends Fish{

    michenosec(String name){
        super(name);
        this.name = name;
    }

    void swim(){
        System.out.println("Привет, михеносек быстро плавает");
    }

    void eat(){
        System.out.println("Это не хищная рыба");
    }
}

class pingvin extends Bird{

    pingvin(String name){
        super(name);
        this.name = name;

    }

    void eat (){System.out.println("Пингвины любят рыбу");}
    void sleep(){System.out.println("Пингвины спят вместе");}

    @Override
    void fly() {
        System.out.println("Пингвины не летают");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Пингвины не поют");
    }
}

class Lev extends Mammal{
    String name;
    Lev(String name){
        super(name);
        this.name = name;

    }

    void eat (){System.out.println("Leo liked meat");}
    void sleep(){System.out.println("Лев много спит");}
    void run(){System.out.println("Бегает, но бывают быстрее кошки");}


}


