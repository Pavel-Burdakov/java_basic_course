package Lesson_27_Interface;


public class Test {
    public static void main(String[] args) {

        michenosec m1 = new michenosec("Misha");
        System.out.println(m1.name);
        m1.eat();
        m1.sleep();
        m1.swim();

        speakable s1 = new pingvin("Lo-Lo");
        s1.speak();

        Animal a1 = new Lev("Киса");
        a1.eat();
        a1.sleep();

        Mammal ma1 = new Lev("Пуся");
        ma1.eat();
        ma1.sleep();
        ma1.run();
        ma1.speak();

        //-----------------//

        System.out.println("//-----------------//");


        Animal an1 = new pingvin("pingvin1");
        Animal an2 = new Lev("lev1");
        Animal an3 = new michenosec("fish1");

        Bird b1 = new pingvin("lo=lo");

        Fish f1 = new michenosec("fish2");

        Lev l1 = new Lev("lev2");

        Mammal m11 = new Lev("lev3");

        michenosec m12 = new michenosec("fish3");

        pingvin p1 = new pingvin("pingvin2");

        Animal[] arr1 = {an1, an2, an3, b1, f1, l1, m11, m12, p1};


        speakable sp1 = new pingvin("pingvin3");
        speakable sp2 = new Lev("lev4");

        for (Animal a : arr1) {

            if (a instanceof pingvin) {
                pingvin p = (pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.sleep();
                l.speak();
            } else if (a instanceof michenosec) {
                michenosec m = (michenosec) a;
                System.out.println(m.name);
                m.swim();
                m.sleep();
                m.eat();
            }
        }

        System.out.println("//-----------------//");
        speakable[] arr2 = {sp1, sp2, b1, m11, p1, l1};

        for (speakable s:arr2){
            if (s instanceof pingvin ){
                pingvin p = (pingvin) s;
                System.out.println();
                p.speak();
                p.eat();
                p.sleep();
                p.fly();
            } else if (s instanceof Lev){
                Lev l = (Lev) s;
                System.out.println(l.name);
                l.speak();
                l.sleep();
                l.run();
                l.eat();

            }

        }





        }


    }


