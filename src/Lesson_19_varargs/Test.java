package Lesson_19_varargs;

public class Test {
// varargs может быть только один и должен стоять на последнем месте в списке параметров

// varargs переводится компилятором в массив, поэтому
// не может быть аналогично метода с массивом в параметрах


    static void summa(int ...a){

        int s = 0;
        for (int i = 0; i< a.length; i++) {
            s = s+= a[i];
        }

        System.out.println(s);


    }



    public static void main(String[] args) {

        summa(3,3,3,3,3);
        summa(new int[]{1,2,3});

    }

}
