import model.Student;
import model.StudentDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentDBTest {

    @Test
    void testtrue_whengetAllStudentsIsEqual() {

        Student anton = new Student("1", "Anton");
        Student berta = new Student("2", "Berta");
        Student[] expectedArray = {anton, berta};

        StudentDB db = new StudentDB(expectedArray);

        Student[] actualArray = db.getAllStudents();


//        Assertions.assertEquals(expectedArray, actualArray);
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }


    @Test
    void testtrue_whenToStringCheckEqual() {
        Student anton = new Student("1", "Anton");
        Student berta = new Student("2", "Berta");
        Student[] expectedArray = {anton, berta};

        StudentDB db = new StudentDB(expectedArray);

        String actual = db.toString();
        String expected = "StudentDB{students=[Student{id='1', name='Anton'}, Student{id='2', name='Berta'}]}";

        Assertions.assertEquals(expected, actual);


    }    @Test
    void testfalse_whenToStringCheckNotEqual() {
        Student anton = new Student("1", "Anton");
        Student berta = new Student("2", "Berta");
        Student[] expectedArray = {anton, berta};

        StudentDB db = new StudentDB(expectedArray);

        String actual = db.toString();
        String expected = "StudentDBstudents=[Student{id='1', name='Anton'}, Student{id='2', name='Berta'}]}";

        Assertions.assertNotEquals(expected, actual);
    }


    @Test
    void testtrue_giveBackRandomStudent() {
        Student anton = new Student("1", "Anton");
        Student berta = new Student("2", "Berta");
        Student klaus = new Student("3", "Klaus");
        Student[] expectedArray = {anton, berta};


        StudentDB db = new StudentDB(expectedArray);

        Student actual = db.randomStudent();

        boolean check = false;

        for (int i = 0; i < expectedArray.length; i++) {
            if (actual == expectedArray[i]) {
                check = true;
            }
        }

        Assertions.assertTrue(check);
    }

    @Test
    void testfalse_giveBackRandomStudent() {
        Student anton = new Student("1", "Anton");
        Student berta = new Student("2", "Berta");
        Student klaus = new Student("3", "Klaus");
        Student[] initialArray = {anton, berta};
        Student[] checkArray = {klaus};

        StudentDB db = new StudentDB(initialArray);

        Student actual = db.randomStudent();

        boolean check = false;

        for (int i = 0; i < checkArray.length; i++) {
            if (actual == checkArray[i]) {
                check = true;
            }
        }

        Assertions.assertFalse(check);
    }


    @Test
    void testfalse_addStudentklaus(){

        Student anton = new Student("1", "Anton");
        Student berta = new Student("2", "Berta");
        Student klaus = new Student("3", "Klaus");
        Student hilde = new Student("4", "Hilde");
        Student[] expectedArray = {anton, berta};

        StudentDB db = new StudentDB(expectedArray);

        String num1 = db.toString();

        db.addStudent(klaus);
        String num2 = db.toString();

        Assertions.assertNotEquals(num1, num2);
    }
 @Test
    void test_addStudentKlaus(){

        Student anton = new Student("1", "Anton");
        Student berta = new Student("2", "Berta");
        Student klaus = new Student("3", "Klaus");
        Student hilde = new Student("4", "Hilde");
        Student[] expectedArray = {anton, berta};

        StudentDB db = new StudentDB(expectedArray);
     db.addStudent(klaus);
        String actual = db.toString();
        String expected = "StudentDB{students=[Student{id='1', name='Anton'}, Student{id='2', name='Berta'}, Student{id='3', name='Klaus'}]}";

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test_removeStudentAnton(){
        Student anton = new Student("1", "Anton");
        Student berta = new Student("2", "Berta");
        Student klaus = new Student("3", "Klaus");
        Student hilde = new Student("4", "Hilde");
        Student[] expectedArray = {anton, berta, klaus, hilde};

        StudentDB db = new StudentDB(expectedArray);

        db.removeStudent(anton);

        Student[] actual = db.getStudents();
        Student[] expected = {berta, klaus, hilde};

        Assertions.assertArrayEquals(expected, actual);
    }
 @Test
    void test_removeStudentHilde(){
        Student anton = new Student("1", "Anton");
        Student berta = new Student("2", "Berta");
        Student klaus = new Student("3", "Klaus");
        Student hilde = new Student("4", "Hilde");
        Student[] expectedArray = {anton, berta, klaus, hilde};

        StudentDB db = new StudentDB(expectedArray);

        db.removeStudent(hilde);

        Student[] actual = db.getStudents();
        Student[] expected = {anton, berta, klaus};

        Assertions.assertArrayEquals(expected, actual);
    }
 @Test
    void test_removeStudentBerta(){
        Student anton = new Student("1", "Anton");
        Student berta = new Student("2", "Berta");
        Student klaus = new Student("3", "Klaus");
        Student hilde = new Student("4", "Hilde");
        Student[] expectedArray = {anton, berta, klaus, hilde};

        StudentDB db = new StudentDB(expectedArray);

        db.removeStudent(berta);

        Student[] actual = db.getStudents();
        Student[] expected = {anton,klaus, hilde};

        Assertions.assertArrayEquals(expected, actual);
    }


}
