public class Ex2 {

    public static void main(String[] args) {
        Student St1 = new Student("Wade", 20, "66123456", 2);
        Teacher T1 = new Teacher("Logan", 40, "T1234", "Science");
        System.out.println("********************");
        St1.display();
        St1.attendClass();

        System.out.println("********************");
        T1.display();
        T1.teachClass();

        AdvisingTeacher AdvT = new AdvisingTeacher("Tony", 45, "T456", "Software Engineer");
        StudentClubMember CM = new StudentClubMember("Natasha", 19, "66987643", 2);
        System.out.println("********************");
        AdvT.display();
        AdvT.teachClass();
        AdvT.adviseClass();

        System.out.println("********************");
        CM.display();
        CM.attendClass();
        CM.joinClub();
    }
}

abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void display();
}

class Student extends Person {
    private String studentId;
    private int year;

    public Student(String name, int age, String studentId, int year) {
        super(name, age);
        this.studentId = studentId;
        this.year = year;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Student ID: " + studentId + ", Year: " + year);
    }

    public void attendClass() {
        System.out.println(name + " is attending class.");
    }
}

class Teacher extends Person {
    private String teacherId;
    private String department;

    public Teacher(String name, int age, String teacherId, String department) {
        super(name, age);
        this.teacherId = teacherId;
        this.department = department;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Teacher ID: " + teacherId + ", Department: " + department);
    }

    public void teachClass() {
        System.out.println(name + " is teaching " + department + ".");
    }
}

class AdvisingTeacher extends Teacher {
    public AdvisingTeacher(String name, int age, String teacherId, String department) {
        super(name, age, teacherId, department);
    }

    public void adviseClass() {
        System.out.println(name + " is advising a student.");
    }
}

class StudentClubMember extends Student {
    public StudentClubMember(String name, int age, String studentId, int year) {
        super(name, age, studentId, year);
    }

    public void joinClub() {
        System.out.println(name + " is joining in a club activity.");
    }
}



