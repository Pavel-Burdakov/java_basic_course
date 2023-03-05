package Lesson_22;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder name_copy = new StringBuilder(name);
        return name_copy;
    }

    public void setName(StringBuilder name) {
        if (name.length()>=3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course>=1 & course<=4) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade>=1 & grade<=10){
            this.grade = grade;
        }

    }

    public void show_info(){
        StringBuilder show_name = new StringBuilder(getName());
        int show_course = getCourse();
        int show_grade = getGrade();

        System.out.println(show_name);
        System.out.println(show_course);
        System.out.println(show_grade);

        System.out.println("Name " + getName() + " Course " +  getCourse() + " Grade " +  getGrade());
        System.out.println(getName() + " " + getCourse() );

    }



}

class test_student{
    public static void main(String[] args) {

        Student S1 = new Student();
        S1.setName(new StringBuilder("Ivan Ivanov"));
        S1.setCourse(1);
        S1.setGrade(7);

        S1.show_info();

    }
}

