package Lesson_23_OverridingHidingFinal.P2;

import Lesson_23_OverridingHidingFinal.P1.X;
import Lesson_23_OverridingHidingFinal.P2.*;

public class Y extends X  {
 


    public void abc() {
        System.out.println('Y');
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();

    }

}
