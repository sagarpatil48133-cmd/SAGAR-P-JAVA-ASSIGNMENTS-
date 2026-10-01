class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentObjects {
    public static void main(String[] args) {
        Student s1 = new Student("Arun", 85);
        Student s2 = new Student("Rahul", 92);

        s1.display();
        System.out.println();

        s2.display();
    }
}
