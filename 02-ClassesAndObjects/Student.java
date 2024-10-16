public class Student {
    String name;
    int age;
    int studentID;
    boolean IDvalid;
    int semester;
    float averageGrade;

    void sayHello() {
        System.out.println("Hello from "+name);
    }
    void displayName() {
        System.out.println(name);
    }
    void displayAge() {
        System.out.println(age);
    }
    void displayStudentInfo() {
        System.out.println(name + ", " + semester + ", " + averageGrade);
    }
    void changeIDstatus() {
        if (IDvalid == true) {
            IDvalid = false;
            System.out.println("ID is now invalid");
        } else {
            IDvalid = true;
            System.out.println("ID is now valid");
        }
    }
    void displayIDinfo() {
        if (IDvalid == true) {
            System.out.println(name+", "+studentID+" ID is valid");
        } else {
            System.out.println(name+", "+studentID+" ID is invalid");
        }
    }

}