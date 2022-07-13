import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Person one = new Person(123, "Riley");

        System.out.println(one.getName());
        one.setName("Linda");
        System.out.println(one.getName());

        Instructor kris = new Instructor(23, "Kris");
        Student dolio = new Student(32, "Dolio", 20);
        Student desa = new Student(92, "Desa", 32);
        Student[] studentsArray = {dolio, desa};

        System.out.println(dolio.getTotalStudyTime());
        kris.lecture(studentsArray, 90);
        System.out.println(dolio.getTotalStudyTime());
        System.out.println(desa.getTotalStudyTime());
    }
}
