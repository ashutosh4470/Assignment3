import java.util.Stack;
class Student{
    int sid;
    String name;

    Student(int sid,String name){
        this.sid = sid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", name=" + name + "]";
    }

}

public class Stack1 {
    public static void main(String[] args) {
        Stack<Student> stack = new Stack<>();
        stack.push( new Student(1,"Ashutosh"));
        stack.push( new Student(2, "Ram"));
        stack.push( new Student(3, "Laukik"));
        stack.push( new Student(4, "Akshay"));


        for(Student std : stack){
            System.out.println(std.toString());
        }
        System.out.println();

        stack.pop();
        for(Student std : stack){
            System.out.println(std.toString());
        }
        System.out.println();
    }
}
