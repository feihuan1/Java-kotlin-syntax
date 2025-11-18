class Scratch {
    public static void main(String[] args) {
        Teacher mrsJones = new Teacher("Mrs Jones", 32, 52242, "English");
        System.out.print(mrsJones);
        mrsJones.performDuties();
        mrsJones.recordAttendance("Present");

        Student david = new Student("David", 15, 13398);
        System.out.print(david);
        david.performDuties();
        david.recordAttendance("Late");

        // Polymorphism means a class can be it's super class type and it wont be able to change child class property
        Person mrTaylor = new Teacher("Mr Taylor", 25, 28634,"Science");
        ((Teacher) mrTaylor).subject = "Maths";

        // usage of Polymorphism: a array contan both teach and student as Person
        Teacher mrSmith = new Teacher("Mr. Smith", 45, 67890, "History");
        Teacher mrsBrown = new Teacher("Mrs. Brown", 38, 11223, "English");
        Teacher drAdams = new Teacher("Dr. Adams", 50, 44556, "Physics");
        Teacher msGarcia = new Teacher("Ms. Garcia", 29, 77889, "Biology");

        Student alice = new Student("Alice", 16, 13456);
        Student bob = new Student("Bob", 14, 13567);
        Student charlie = new Student("Charlie", 17, 13678);
        Student eve = new Student("Eve", 15, 13789);

        Person[] people = {
                mrSmith,mrsBrown,drAdams, msGarcia, alice ,bob, charlie, eve
        };

        for(Person person : people) {
            System.out.println(person);
            person.recordAttendance("present");
            person.performDuties();
        }
    }
}

abstract class Person{
    String name;
    String role;
    int age;

    Person(String name, String role, int age) {
        this.name = name;
        this.role = role;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + "\n";
    }

    void recordAttendance(String attendanceStatus){
        System.out.println("ATTENDANCE RECORDED: " + attendanceStatus);
    }

    abstract void performDuties();
}

class Teacher extends Person{
    int employeeId;
    String subject;

    Teacher(String name, int age, int employeeId, String subject) {
        super(name, "Teacher", age);
        this.employeeId = employeeId;
        this.subject = subject;
    }

    @Override
    void performDuties() {
        System.out.println("<Teaches" + subject + ">");
    }
}

class Student extends Person{
    int studentId;

    Student(String name, int age, int studentId) {
        super(name, "Student", age);
        this.studentId = studentId;
    }

    @Override
    void performDuties() {
        System.out.println("<Studies ...>");
    }
}