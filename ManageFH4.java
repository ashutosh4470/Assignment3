import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class ManageFH4 {

    // creating Student2 class Objects and passing value to constructor.
    static Student2 s1 = new Student2(1, "john", 34, "java");
    static Student2 s2 = new Student2(2, "Alice", 30, "sql");
    static Student2 s3 = new Student2(3, "bob", 45, "java");
    static Student2 s4 = new Student2(4, "max", 50, "sql");
    static Student2 s5 = new Student2(5, "ram", 55, "java");
    static Student2 s6 = new Student2(6, "hob", 25, "sql");

    // writing the object into the tem4 file.
    public static void writeObj() throws IOException {
        try {
            FileOutputStream op = new FileOutputStream("temp4");
            ObjectOutputStream oo = new ObjectOutputStream(op);

            oo.writeObject(s1);
            oo.writeObject(s2);
            oo.writeObject(s3);
            oo.writeObject(s4);
            oo.writeObject(s5);
            oo.writeObject(s6);

            oo.close();
            op.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Writing Complete..");

    }

    // Reading the object from the temp4 file.
    public static void readObj() throws IOException {
        try {
            FileInputStream fi = new FileInputStream("temp4");
            ObjectInputStream oi = new ObjectInputStream(fi);
            oi.close();
        } catch (EOFException e) {
            e.getMessage();
        }
        System.out.println("Reading Complete..");
    }

    public static void checkResult() throws IOException {
        try {
            FileInputStream fi = new FileInputStream("temp4");
            ObjectInputStream oi = new ObjectInputStream(fi);
            System.out.println("Students Result:");
            while (true) {
                Student2 s = (Student2) oi.readObject();
                s.dispStudent();
            }
        } catch (EOFException e) {
            e.getMessage();
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }
    }

    public static void ResultCount(String sub) {
        int fcnt =0, pcnt=0;
        try {
            FileInputStream fi = new FileInputStream("temp4");
            ObjectInputStream oi = new ObjectInputStream(fi);
            System.out.println();
            while (true) {
                Student2 s = (Student2) oi.readObject();
                if (s.marks < 35 && s.subject.equals(sub))
                    fcnt++;
                 else
                if(s.marks > 35 && s.subject.equals(sub))
                   pcnt++;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("Pass Student in "+sub+" : " + pcnt);
        System.out.println("Fail Student in "+sub+" : " + fcnt);

    }

  

}