import model.Student;
import model.StudentDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Student anton = new Student("1", "Anton");
        Student berta = new Student("2", "Berta");
        Student klaus = new Student("3", "Klaus");
        Student hilde = new Student("4", "Hilde");
        List<Student> studentList = new ArrayList<>();
        studentList.add(anton);
        studentList.add(berta);



        StudentDB db = new StudentDB(studentList);

        System.out.println(db);

        db.addStudent(klaus);
        System.out.println(db);

        db.addStudent(hilde);
        System.out.println(db);

        System.out.println(db.randomStudent());
        System.out.println(db);


        db.removeStudent(hilde);
        System.out.println(db);



    }
}
