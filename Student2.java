import java.io.Serializable;

class Student2 implements Serializable,Comparable<Student2> {
    int id;
    String name;
    int marks;
    String subject;

    public Student2(int id, String name, int marks, String subject) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.subject = subject;
    }

    public void dispStudent() {
        System.out.println("\nid :" + id);
        System.out.println("name :" + name);
        System.out.println("marks :" + marks);
        System.out.println("subject :" + subject+"\n");
    }

    @Override
    public int compareTo(Student2 other) {
        return Integer.compare(this.marks, other.marks);
    }
}