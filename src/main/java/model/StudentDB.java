package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StudentDB {

    //private Student[] students;
    private List<Student> students = new ArrayList<>();

    //Constructor


    public StudentDB(List<Student> students) {
        this.students = students;
    }

    //Getter | Setter


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    //Methods
    public List<Student> getAllStudents() {
        return students;
    }


    public Student randomStudent() {
        double num = Math.random();
        int length = students.size();
        int randomIndex = (int) (num * length);

        return students.get(randomIndex);
    }


//    public void addStudent(Student student) {
//
//        Student[] temp = new Student[students.length + 1];
//        for (int i = 0; i < students.length; i++) {
//            temp[i] = students[i];
//        }
//
//        temp[temp.length - 1] = student;
//        setStudents(temp);
//    }

    public void addStudent(Student student) {
        students.add(student);
    }






//    public void removeStudent(Student student) {
//
//        // Neues Array mit einer kleineren Größe erstellen
//        Student[] temp = new Student[students.length - 1];
//
//        // Index des zu entfernenden Elements im alten Array finden
//        int indexRemoveElement = -1;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] == student) {
//                indexRemoveElement = i;
//                break;
//            }
//        }
//
//        // Elemente vor dem zu entfernenden Element ins neue Array kopieren
//        for (int i = 0; i < indexRemoveElement; i++) {
//            temp[i] = students[i];
//        }
//
//        // Elemente nach dem zu entfernenden Element ins neue Array kopieren
//        for (int i = indexRemoveElement + 1; i < students.length; i++){
//            temp[i - 1] = students[i];
//        }
//
//        setStudents(temp);
//
//
//    }

    public void removeStudent(Student student) {
        students.remove(student);
    }









    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Objects.equals(students, studentDB.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
}

