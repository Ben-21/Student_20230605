package model;

import java.util.Arrays;

public class StudentDB {

    private Student[] students;

    //Constructor
    public StudentDB(Student[] students) {
        this.students = students;
    }


    //Getter | Setter
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    //Methods
    public Student[] getAllStudents() {
        return students;
    }


    public Student randomStudent() {
        double num = Math.random();
        int length = students.length;
        int randomIndex = (int) (num * length);

        return students[randomIndex];
    }


    public void addStudent(Student student) {

        Student[] temp = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            temp[i] = students[i];
        }

        temp[temp.length - 1] = student;
        setStudents(temp);

//        students = temp;
//        temp[0] = null;

    }

    public void removeStudent(Student student) {

        // Neues Array mit einer kleineren Größe erstellen
        Student[] temp = new Student[students.length - 1];

        // Index des zu entfernenden Elements im alten Array finden
        int indexRemoveElement = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == student) {
                indexRemoveElement = i;
                break;
            }
        }

        // Elemente vor dem zu entfernenden Element ins neue Array kopieren
        for (int i = 0; i < indexRemoveElement; i++) {
            temp[i] = students[i];
        }

        // Elemente nach dem zu entfernenden Element ins neue Array kopieren
        for (int i = indexRemoveElement + 1; i < students.length; i++){
            temp[i - 1] = students[i];
        }

        setStudents(temp);


    }


    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Arrays.equals(students, studentDB.students);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(students);
    }
}

