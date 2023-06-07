import model.Student;
import model.StudentDB;

import java.util.*;

public class Main {

    public static void main(String[] args){
        Student anton = new Student("1", "Anton");
        Student berta = new Student("2", "Berta");
        Student klaus = new Student("3", "Klaus");
        Student hilde = new Student("4", "Hilde");
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(anton);
//        studentList.add(berta);

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put(anton.getId(), anton);
        studentMap.put(berta.getId(), berta);



//      StudentDB db = new StudentDB(studentList);
        StudentDB db = new StudentDB(studentMap);
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
