public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.age = 23;
        s.studentID = 231606;
        s.IDvalid = true;
        s.semester = 3;
        s.averageGrade = 4.5f;
        s.displayIDinfo();
        s.changeIDstatus();
        s.displayIDinfo();

        Student s1 = new Student();
        s1.name = "Jane";
        s1.age = 22;
        s1.studentID = 231607;
        s1.IDvalid = false;
        s1.semester = 2;
        s1.averageGrade = 4.2f;
        s1.displayStudentInfo();
    }
}
