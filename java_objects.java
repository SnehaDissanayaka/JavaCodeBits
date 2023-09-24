
public class java_objects {
    public static void main(String[] args) {
        Student S1 = new Student("kamal", "S001", 31, 89);
        S1.DisplayStudent();
        Student S2 = new Student("Namal", "S002", 21, 59);
        S2.DisplayStudent();
        Student S3 = new Student("Damal", "S003", 17, 39);
        S3.DisplayStudent();

    }
}

class Student {
    String sid;
    String name;
    int age;
    int marks;

    Student(String s, String n, int a, int m) {
        this.sid = s;
        this.name = n;
        this.age = a;
        this.marks = m;
    }

    void DisplayCatagory() {
        if (this.age >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("minor");
        }
    }

    char DisplayGrade() {
        if (this.marks >= 75) {
            return 'A';
        } else if (this.marks >= 65) {
            return 'B';
        } else if (this.marks >= 55) {
            return 'C';
        } else if (this.marks >= 40) {
            return 'S';
        } else {
            return 'W';
        }

    }

    void DisplayStudent() {
        System.out.println("Student Details");
        System.out.println("Student ID : " + this.sid);
        System.out.println("Student Name : " + this.name);
        System.out.print("Student Catagory : ");
        this.DisplayCatagory();
        System.out.println("Grade : " + this.DisplayGrade());
    }

}